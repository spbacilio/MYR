package com.tmm.myr.base.utils;

import java.io.Serializable;

import com.tmm.myr.imexMyR.Dto.Imex_MandRMaster;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * The objective of the MaintenanceResponse class is ...
 * 
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * 
 * */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MaintenanceResponse implements Serializable {

	/**
	 * Serial id number.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The integer result.
	 * */
	private Integer integerResult;

	/**
	 * The message.
	 * */
	private String message;

	/**
	 * Error code.
	 * */
	private String status;
	
	/**
	 * Exception generated.
	 * */
	private String exception;

	/**
	 * Container history.
	 * */
	private Imex_MandRMaster containerHistory;
}
