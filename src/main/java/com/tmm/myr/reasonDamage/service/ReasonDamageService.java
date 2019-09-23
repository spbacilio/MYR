package com.tmm.myr.reasonDamage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmm.myr.reasonDamage.converter.ReasonDamageConverter;
import com.tmm.myr.reasonDamage.dto.ReasonDamageDto;
import com.tmm.myr.reasonDamage.iservice.IReasonDamageService;
import com.tmm.myr.reasonDamage.repository.IReasonDamageRepository;

/**
 * The main service for Reason Damages.
 * 
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 * */
@Service
public class ReasonDamageService implements IReasonDamageService {

	/**
	 * Reason damage respository
	 * */
	@Autowired
	private IReasonDamageRepository reasonDamageRespository;
	
	/**
	 * Reason damage converter.
	 * */
	@Autowired
	private ReasonDamageConverter reasonDamageConverter;

	@Override
	public List<ReasonDamageDto> getAllReasonDamage() throws Exception {
		return reasonDamageConverter.objectToDto(reasonDamageRespository.findAllReasonDamage());
	}

}
