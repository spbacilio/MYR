package com.tmm.myr.EIRGPositions.IService;

import java.util.Map;

import com.tmm.myr.EIRGPositions.dto.GeneralPositionsDto;


/**
 * The main class for sections components.
 * 
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
public interface IGeneralPositionService {

	/**
	 * Fill the combo box control for section components.
	 * 
	 * @throws Exception Exception.
	 * */
	Map<Integer, GeneralPositionsDto> fillComboBoxControl() throws Exception;
}
