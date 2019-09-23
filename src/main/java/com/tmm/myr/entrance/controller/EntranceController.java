package com.tmm.myr.entrance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tmm.myr.base.bussiness.ContainerNameFormat;
import com.tmm.myr.base.constants.Constants;
import com.tmm.myr.base.constants.Messages;
import com.tmm.myr.base.enums.MaintenanceOperation;
import com.tmm.myr.base.enums.Status;
import com.tmm.myr.base.utils.MaintenanceResponse;
import com.tmm.myr.catMaritimeShippers.IService.IMaritimeShippersService;
import com.tmm.myr.catSizes.IService.ICatSizesService;
import com.tmm.myr.entrance.IService.IImexContainerService;
import com.tmm.myr.entrance.dto.ContainerDto;
import com.tmm.myr.imexMyR.IService.IMyrService;
import com.tmm.myr.inventory.IService.IInventoryService;
import com.tmm.myr.terminal.IService.ITerminalService;

import lombok.extern.slf4j.Slf4j;

/**
 * The objective of the EntranceController class is ...
 * 
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * 
 * */
@Slf4j
@Controller
public class EntranceController {
	
	/**
	 * Main url.
	 * */
	public static final String URL_ENTRANCE = "entrance/entranceForm";
	
	@Autowired
	private IImexContainerService iMexContainerService;

	/**
	 * Get container owner.
	 * */
	@Autowired
	private IMaritimeShippersService maritimeShippersService;
	
	/**
	 * Terminal service.
	 * */
	@Autowired
	private ITerminalService terminalService;

	/**
	 * Sizes service.
	 * */
	@Autowired
	private ICatSizesService catSizesService;
	
	/**
	 * Sizes service.
	 * */
	@Autowired
	private IInventoryService inventoryService;
	
	/**
	 * Sizes service.
	 * */
	@Autowired
	private IMyrService MyrService;

	/**
	 * Load the main page.
	 * */
	@RequestMapping(URL_ENTRANCE)
	public String LoanMainPage(ModelMap model) {
		try {
			ContainerDto dto = ContainerDto.builder().build();
			model.addAttribute("containerForm", dto);
			model.addAttribute("owners", maritimeShippersService.fillComboBoxControl());
			model.addAttribute("terminals", terminalService.fillComboBox());
			model.addAttribute("sizes", catSizesService.fillComboBoxControl());
		}
		catch (Exception exception) {
			log.error("Error containerValidation: {}", exception.getMessage());
		}
		return URL_ENTRANCE;
	}

	/**
	 * 
	 * */
	@RequestMapping(value = "/containers/validation", method = RequestMethod.GET)
	@ResponseBody
	public MaintenanceResponse containerValidation(@RequestParam(required = true)String prefix,
			@RequestParam(required = true)String code,
			@RequestParam(required = true)String operation) {
		MaintenanceResponse response = MaintenanceResponse.builder().build();
		MaintenanceOperation operationType = MaintenanceOperation.getOperation(operation);
		try {
			switch (operationType) {
			case SELECT:
				String containerName = ContainerNameFormat.containerToFormatSQL(prefix, code);
				Integer containerId = iMexContainerService.conteinerExistValidation(containerName);
				if(containerId == 0) {
					response.setMessage(Messages.ADD_SUCCESS);
					response.setStatus(Status.SUCCESS.getValue());			
				}
				else {
					response.setMessage(Messages.ADD_REPEAT);
					response.setStatus(Status.WARN.getValue());																	
				}
				response.setIntegerResult(containerId);
				break;
			default:
				break;
			}
		} catch (Exception exception) {
			response.setMessage(Messages.ADD_FAILED);
			response.setStatus(Status.ERROR.getValue());
			response.setException(exception.getMessage());
			log.error("Error containerValidation: {}", exception.getMessage());			
		}
		return response;
	}
	
	@RequestMapping(value = "/containers/saveContainer", method = RequestMethod.GET)
	@ResponseBody
	public MaintenanceResponse saveEntrance(@RequestParam(required = true)String container) {
		MaintenanceResponse response = MaintenanceResponse.builder().build();		
		try {
			ObjectMapper mapper = new ObjectMapper();
			Integer identifier = 0;
			log.info("JSON: {}", container);
			ContainerDto dto = mapper.readValue(container, ContainerDto.class);
			log.info("Container Dto: {}", dto.toString());
			String containerName = ContainerNameFormat.containerToFormatSQL(dto.getContainerName(), dto.getContainerIdentifier().toString());
			Integer existValidation = iMexContainerService.conteinerExistValidation(containerName);
			
			if (existValidation == 0) {
				log.error("Disponible");
				identifier = iMexContainerService.saveContainer(dto.getContainerName(), dto.getContainerIdentifier().toString(), Constants.CONTAINER);
			}
			else {
				//Desde aqui se debe lanzar el warn de item repetido
				log.error("No disponible");
				identifier = existValidation;
				
			}
			//Guarda inventario
			Integer inventoryIdentifier = inventoryService.saveInventory(dto, identifier.toString());
			if (inventoryIdentifier > 0) {
				MyrService.saveMyR(dto, identifier, inventoryIdentifier);				
			}
			log.info("Id generated: {} ", identifier);
			response.setMessage(Messages.ADD_SUCCESS);
			response.setStatus(Status.SUCCESS.getValue());
		}
		catch (Exception exception) {
			response.setMessage(Messages.ADD_FAILED);
			response.setStatus(Status.ERROR.getValue());
			response.setException(exception.getMessage());
			//log.error("Error containerValidation: {}", exception.getMessage());
			exception.printStackTrace();
		}
		
		return response;
	}

}
