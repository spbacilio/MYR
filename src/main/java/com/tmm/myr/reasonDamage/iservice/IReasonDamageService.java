package com.tmm.myr.reasonDamage.iservice;

import java.util.List;

import com.tmm.myr.reasonDamage.dto.ReasonDamageDto;

/**
 * 
 * The main interface for Reason Damage Service.
 * 
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 * */
public interface IReasonDamageService {

	List<ReasonDamageDto> getAllReasonDamage() throws Exception;
}
