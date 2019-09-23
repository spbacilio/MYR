package com.tmm.myr.EIRComponents.IService;

import java.util.List;
import java.util.Map;

import com.tmm.myr.EIRComponents.dto.EirComponentDto;

/**
 * The main class for EIR components.
 * 
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
public interface IEIRComponentService {

	/**
	 * Return a EirComponentDto map.
	 * 
	 * @param eirTypeId Id of section component.
	 * @return Map of EirComponentDto objects.
	 * @throws Exception Exception.
	 * */
	List<EirComponentDto> fillComboBoxControl(Integer eirTypeId) throws Exception;
}
