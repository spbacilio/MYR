package com.tmm.myr.terminal.controller;

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

import lombok.extern.slf4j.Slf4j;

/**
 * The objective of the TerminalController class is ...
 * 
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * 
 * */
@Slf4j
@Controller
public class TerminalController {

	private static final String URL_TERMINAL = "catalogues/terminals";
	
	@Autowired
	private ITerminalService terminalService;
	
	@RequestMapping(URL_TERMINAL)
	public String loadMainPage(ModelMap model) {
		System.out.println("Load main page Terminal");
		try {
			model.addAttribute("terminalList", terminalService.getAllTerminals());
		}
		catch (Exception ex) {
			log.info("Error LoanMainPage: {}", ex.getMessage());
		}
		return URL_TERMINAL;
	}
	
	@RequestMapping(value = "/terminals/maintenance", method = RequestMethod.GET)
	@ResponseBody
	public MaintenanceResponse maintenance(@RequestParam(required = true)String name,
			@RequestParam(required = true)String code,
			@RequestParam(required = true)String operation,
			@RequestParam(required = true)String id) {
		log.info("Mantenimiento de terminales." + name);
		MaintenanceResponse response = MaintenanceResponse.builder().build();
		MaintenanceOperation operationType = MaintenanceOperation.getOperation(operation);
		try {
			switch(operationType) {
				case INSERT:
					terminalService.saveTerminal(name, code);
					response.setMessage(Messages.ADD_SUCCESS);					
					response.setStatus(Status.SUCCESS.getValue());										
					break;
				case DELETE:
					terminalService.deleteTerminal(Integer.parseInt(id));
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
}
