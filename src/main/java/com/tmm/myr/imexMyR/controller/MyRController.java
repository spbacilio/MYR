package com.tmm.myr.imexMyR.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tmm.myr.EIRComponents.IService.IEIRComponentService;
import com.tmm.myr.EIRComponents.dto.EirComponentDto;
import com.tmm.myr.EIRDamage.Dto.EIRDamageDto;
import com.tmm.myr.EIRDamage.iservice.IEIRDamageService;
import com.tmm.myr.EIRGPositions.IService.IGeneralPositionService;
import com.tmm.myr.EIRGPositions.dto.GeneralPositionsDto;
import com.tmm.myr.EIRLocation.dto.DamageLocationDto;
import com.tmm.myr.EIRLocation.iservice.IDamageService;
import com.tmm.myr.base.bussiness.ContainerNameFormat;
import com.tmm.myr.base.constants.Messages;
import com.tmm.myr.base.enums.Status;
import com.tmm.myr.base.utils.MaintenanceResponse;
import com.tmm.myr.entrance.IService.IImexContainerService;
import com.tmm.myr.imexMyR.Dto.Imex_MandRMaster;
import com.tmm.myr.imexMyR.Dto.MyRDto;
import com.tmm.myr.imexMyR.IService.IMyrService;
import com.tmm.myr.reasonDamage.iservice.IReasonDamageService;
import com.tmm.myr.users.dto.UserDto;

import lombok.extern.slf4j.Slf4j;

/**
 * The main class for sections components.
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
@Slf4j
@Controller
public class MyRController {

	/**
	 * Link main.
	 * */
	private static final String URL_MYR = "myr/myrForm";

	/**
	 * Container service.
	 * */
	@Autowired
	private IImexContainerService iMexContainerService;

	/**
	 * Myr service.
	 * */
	@Autowired
	private IMyrService MyrService;

	/**
	 * General position service.
	 * */
	@Autowired
	private IGeneralPositionService generalPositionService;

	/**
	 * EIR component service.
	 * */
	@Autowired
	private IEIRComponentService eirComponentService;

	/**
	 * EIR damage service.
	 * */
	@Autowired
	private IEIRDamageService eirDamageService;

	/**
	 * Damage location service.
	 * */
	@Autowired
	private IDamageService damageService;
	
	/**
	 * Reason damage service.
	 * */
	@Autowired
	private IReasonDamageService reasonDamageService;
	
	private Map<Integer, GeneralPositionsDto> equipmentType = new HashMap<>();

	/**
	 * Load the main page.
	 * @param model Data model.
	 * 
	 * @return Link to the main page.
	 * */
	@RequestMapping(value = URL_MYR)
	public String loadMainPage(ModelMap model) {
		try {
			MyRDto dto = MyRDto.builder().build();
			equipmentType = generalPositionService.fillComboBoxControl();
			model.addAttribute("myrForm", dto);
			model.addAttribute("containerSection", equipmentType);
			model.addAttribute("reasonDamageList", reasonDamageService.getAllReasonDamage());
		}
		catch (Exception exception) {
			log.info("Error loadMainPage: {}", exception.getMessage());
		}
		return URL_MYR;
	}
	
	/**
	 * Search a container.
	 * 
	 * @param prefix The number of container.
	 * @param code The name of container.
	 * @return The Response object.
	 * */
	@RequestMapping(value = "/myr/searchContainer", method = RequestMethod.GET)
	@ResponseBody
	MaintenanceResponse containerValidation(@RequestParam(required = true)String prefix, @RequestParam(required = true)String code) {
		MaintenanceResponse response = MaintenanceResponse.builder().build();
		try {			
			String containerName = ContainerNameFormat.containerToFormatSQL(prefix.toUpperCase(), code);			
			Integer containerId = iMexContainerService.conteinerExistValidation(containerName);
			log.info("Container id: " + containerId);
			if(containerId == 0) {
				response.setMessage(Messages.NO_EXIST);
				response.setStatus(Status.WARN.getValue());			
			}
			else {
				//Busca el historial del contenedor.				
				UserDto user = UserDto.builder().terminalId(33).build();
				Imex_MandRMaster history = MyrService.CosultaEquipoPorContenedor(containerName, 1055, user);
				log.info("Historial: {}", history.toString());
				response.setMessage(Messages.SEARCH_SUCCESS);
				response.setStatus(Status.SUCCESS.getValue());
				response.setContainerHistory(history);
			}
		}
		catch (Exception exception) {
			response.setMessage(Messages.ADD_FAILED);
			response.setStatus(Status.ERROR.getValue());
			response.setException(exception.getMessage());
			log.error("Error containerValidation: {}", exception.getMessage());
		}				
		return response;
	}

	/**
	 * 
	 * 
	 * */
	@RequestMapping(value = "/myr/eirComponents", method = RequestMethod.GET)
	@ResponseBody
	public List<Object> getEIRComponents(@RequestParam(required = true)String sectionIdentifier) {
		List<Object> objectList = new ArrayList<>();
		try {
			GeneralPositionsDto dto = equipmentType.get(Integer.parseInt(sectionIdentifier));
			List<EirComponentDto> componentList = eirComponentService.fillComboBoxControl(dto.getEirTypeId());
			log.info("Paramter: -> {}", dto.getEirTypeId());
			List<EIRDamageDto> eirDamageList = eirDamageService.getEIRDamageByEirType(dto.getEirTypeId());
			objectList.add(componentList);
			objectList.add(eirDamageList);
		}
		catch (Exception exception) {
			log.error("Error getEIRComponents: {}", exception.getMessage());
			//exception.printStackTrace();
		}
		return objectList;
	}
	
	@RequestMapping(value = "/myr/damageLocations", method = RequestMethod.GET)
	@ResponseBody
	public List<DamageLocationDto> getDamageLocations(@RequestParam(required = true)String sectionIdentifier,
			@RequestParam(required = true)String componentIdentifier) {
		List<DamageLocationDto> damageLocationList = new ArrayList<>();
		try {
			damageLocationList = damageService.getAllDamageLocations(Integer.parseInt(sectionIdentifier),
					Integer.parseInt(componentIdentifier));
			damageLocationList.forEach(x -> {
				log.info("-> {}", x.toString());
			});
		}
		catch (Exception exception) {
			log.error("Error getDamageLocations: {}", exception.getMessage());
		}
		
		return damageLocationList;
	}
	
}
