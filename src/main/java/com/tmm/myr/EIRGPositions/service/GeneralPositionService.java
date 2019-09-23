package com.tmm.myr.EIRGPositions.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmm.myr.EIRGPositions.IService.IGeneralPositionService;
import com.tmm.myr.EIRGPositions.converter.GeneralPositionsConverter;
import com.tmm.myr.EIRGPositions.dto.GeneralPositionsDto;
import com.tmm.myr.EIRGPositions.repository.IEirGeneralPositionsRepository;

/**
 * The main class for sections components.
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
@Service
public class GeneralPositionService implements IGeneralPositionService {

	/**
	 * General position repository.
	 * */
	@Autowired
	private IEirGeneralPositionsRepository generalPositionRepository;

	/**
	 * General position converter.
	 * */
	@Resource
	private GeneralPositionsConverter generalPositionsConverter;

	/**
	 * {@inheritDoc}
	 * */
	@Override
	public Map<Integer, GeneralPositionsDto> fillComboBoxControl() throws Exception {
		Map<Integer, GeneralPositionsDto> map = generalPositionsConverter.objectToDto(generalPositionRepository.findGeneralPositions());
		return map;
	}

}
