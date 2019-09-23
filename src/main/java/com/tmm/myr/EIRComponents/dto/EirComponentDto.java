package com.tmm.myr.EIRComponents.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The objective of EirComponentDto class is to map field
 * from ImexEirComponents entity.
 * 
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class EirComponentDto {
	
	/**
	 * EIR component identifier.
	 * */
	private Integer eirComponentIdentifier;

	/**
	 * Component description.
	 * */
	private String component;

	/**
	 * AAR code.
	 * */
	private String aarCode;
	
}
