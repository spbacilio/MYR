package com.tmm.myr.yard.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tmm.myr.base.constants.Messages;
import com.tmm.myr.base.enums.MaintenanceOperation;
import com.tmm.myr.base.enums.Status;
import com.tmm.myr.base.utils.MaintenanceResponse;
import com.tmm.myr.terminal.IService.ITerminalService;
import com.tmm.myr.yard.IService.IYardService;
import com.tmm.myr.yard.dto.YardDto;

import lombok.extern.slf4j.*;

/**
 * The objective of the YardController class is ...
 * 
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * 
 * */
@Slf4j
@Controller
public class YardController {

	/**
	 * Url .
	 * */
	private static final String URL_YARD = "catalogues/yards";

	/**
	 * Yard service.
	 * */
	@Autowired
	private IYardService yardService;

	/**
	 * Terminal service.
	 * */
	@Autowired
	private ITerminalService terminalService;

	
	/**
	 * Load the main page.
	 * @param model Data model.
	 * @return Link to the main page.
	 * */
	@RequestMapping(URL_YARD)
	public String LoanMainPage(ModelMap model) {		
		try {
			YardDto dto = new YardDto();
			model.addAttribute("yardForm", dto);
			model.addAttribute("yardList", yardService.getAll());
			model.addAttribute("yardNames", yardService.yardComboBox());
			model.addAttribute("terminalNames", terminalService.fillComboBox());
		}
		catch (Exception ex) {
			log.info("Error LoanMainPage: {}", ex.getMessage());
		}
		return URL_YARD;
	}
	
	@RequestMapping(value = "/yards/maintenance", method = RequestMethod.GET)
	@ResponseBody
	public MaintenanceResponse maintenance(@RequestParam(required = true)String name,
			@RequestParam(required = true)String identifier,
			@RequestParam(required = true)String operation) {		
		log.info("Mantenimiento de patios." + name);
		MaintenanceResponse response = MaintenanceResponse.builder().build();
		MaintenanceOperation operationType = MaintenanceOperation.getOperation(operation);
		try {
			switch(operationType) {
				case INSERT:
					if (yardService.saveYard(name)) {
						response.setMessage(Messages.ADD_SUCCESS);					
						response.setStatus(Status.SUCCESS.getValue());
					}
					else {
						response.setMessage(Messages.ADD_REPEAT);					
						response.setStatus(Status.WARN.getValue());
					}
					break;
				case DELETE:
					yardService.deleteYard(Integer.parseInt(identifier));
					response.setMessage(Messages.DELETE);	
					response.setStatus(Status.SUCCESS.getValue());
					break;	
				default: break;
			}
		}
		catch (Exception exception) {
			response.setMessage(Messages.ADD_FAILED);
			response.setStatus(Status.ERROR.getValue());
			response.setException(exception.getMessage());
			log.error("Error maintenance: {}", exception.getMessage());
		}		
		return response;
	}
	
	@RequestMapping(value = "/yards/saveYardRelations", method = RequestMethod.GET)
	@ResponseBody
	public MaintenanceResponse saveYardRelations(@RequestParam(required = true)String terminal,
			@RequestParam(required = true)String yard) {		
		MaintenanceResponse response = MaintenanceResponse.builder().build();
		log.info("Terminal: {} {}", terminal, yard);
		try {
			Integer id = yardService.validateRelationExistence(Integer.parseInt(terminal), Integer.parseInt(yard));
			log.error("Terminal id: {} PAtioId: {}",terminal , yard);
			log.error("Id relation: {}", id);
			if (id == null) {
				yardService.saveYardRelation(Integer.parseInt(terminal), Integer.parseInt(yard), 1);
				response.setMessage(Messages.ADD_SUCCESS);					
				response.setStatus(Status.SUCCESS.getValue());
			}
			else {
				response.setMessage(Messages.ADD_REPEAT);					
				response.setStatus(Status.WARN.getValue());
			}			
		}
		catch (Exception exception) {
			response.setMessage(Messages.ADD_FAILED);
			response.setStatus(Status.ERROR.getValue());
			response.setException(exception.getMessage());
			log.info("Error saveYardRelations: {}" + exception);
		}
		return response;
		}
	
	@RequestMapping(value = "/yards/deleteYardRelations", method = RequestMethod.GET)
	@ResponseBody
	public MaintenanceResponse deleteYardRelation(@RequestParam(required = true)String terminalId,
			@RequestParam(required = true)String yardId) {		
		MaintenanceResponse response = MaintenanceResponse.builder().build();
		try {
			yardService.deleteYardRelation(Integer.parseInt(terminalId), Integer.parseInt(yardId));
			response.setMessage(Messages.DELETE);					
			response.setStatus(Status.SUCCESS.getValue());
		}
		catch (Exception exception) {
			response.setMessage(Messages.ADD_FAILED);
			response.setStatus(Status.ERROR.getValue());
			response.setException(exception.getMessage());
			log.info("Error deleteYardRelation: {}" + exception);
		}
		return response;
	}
	
	@RequestMapping(value = "/yards/loadYardRelations", method = RequestMethod.GET)
	@ResponseBody
	public List<YardDto> loadYardRelation(@RequestParam(required = true)String terminalId){
		log.info("Load yard relations.");
		List<YardDto> yardRelations = new ArrayList<>();
		try {
			yardRelations = yardService.loadYardRelation(Integer.parseInt(terminalId));
			log.info("size of yard relations: {}", yardRelations.size());
		}
		catch (Exception exception) {
			log.error("Error maintenance: {}", exception.getMessage());
		}
		return yardRelations;
	}
	

}
