package com.tmm.myr.EIRDamage.Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * This is the main mapper class for ImexEirDamage entity.
 * 
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 * */
@ToString
@Builder
@Getter
@Setter
public class EIRDamageDto {

	/**
	 * EIR damage identifier.
	 * */
	private Integer eirDamageIdentifier;

	/**
	 * The damage description.
	 * */
	private String damageDescription;

	/**
	 * The ARR code.
	 * */
	private String aarCode;

	/**
	 * The EIR type identifier.
	 * */
	private Integer EIRTypeIdentifier; 

}
