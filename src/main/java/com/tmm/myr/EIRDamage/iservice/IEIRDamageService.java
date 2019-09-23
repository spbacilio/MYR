package com.tmm.myr.EIRDamage.iservice;

import java.util.List;

import com.tmm.myr.EIRDamage.Dto.EIRDamageDto;

/**
 * The main interface for EIR damage module.
 * 
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 * */
public interface IEIRDamageService {

	/**
	 * Get EIR damage according by EIR type id selected.
	 * 
	 * @param EIRTypeId EIR type selected.
	 * 
	 * @return List of EIRDamageDto object.
	 * @throws Exception Exception.
	 * */
	List<EIRDamageDto> getEIRDamageByEirType(Integer EIRTypeId) throws Exception;
}
