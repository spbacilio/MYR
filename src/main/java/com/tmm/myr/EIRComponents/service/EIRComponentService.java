package com.tmm.myr.EIRComponents.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmm.myr.EIRComponents.IService.IEIRComponentService;
import com.tmm.myr.EIRComponents.conveter.EirComponentConveter;
import com.tmm.myr.EIRComponents.dto.EirComponentDto;
import com.tmm.myr.EIRComponents.repository.IEIRComponentRepository;

/**
 * This class provide the services for EIR controller.
 *
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 * */
@Service
public class EIRComponentService implements IEIRComponentService {

	/**
	 * EIR component repository.
	 * */
	@Autowired
	private IEIRComponentRepository eirComponentRepository;

	/**
	 * EIR component converter.
	 * */
	@Resource
	private EirComponentConveter componentConverter;
	
	/**
	 * {@inheritDoc}
	 * */
	@Override
	public List<EirComponentDto> fillComboBoxControl(Integer eirTypeId) throws Exception {
		return componentConverter.objectToDto(eirComponentRepository.findEirComponent(eirTypeId));
	}

}
