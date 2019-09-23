package com.tmm.myr.EIRDamage.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmm.myr.EIRDamage.Dto.EIRDamageDto;
import com.tmm.myr.EIRDamage.converter.EIRDamageConverter;
import com.tmm.myr.EIRDamage.iservice.IEIRDamageService;
import com.tmm.myr.EIRDamage.repository.IEIRDamageRepository;

/**
 * The main class for EIR damage module.
 * 
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 * */
@Service
public class EIRDamageService implements IEIRDamageService {

	/**
	 * EIR damage converter.
	 * */
	@Resource
	private EIRDamageConverter damageConverter;

	/**
	 * EIR damage repository.
	 * */
	@Autowired
	private IEIRDamageRepository damageRepository;

	/**
	 * {@inheritDoc}
	 * */
	@Override
	public List<EIRDamageDto> getEIRDamageByEirType(Integer EIRTypeId) throws Exception {
		return damageConverter.objectToDto(damageRepository.findAllEIRDamage(EIRTypeId));
	}

}
