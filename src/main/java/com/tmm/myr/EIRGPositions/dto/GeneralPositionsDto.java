package com.tmm.myr.EIRGPositions.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * The main class for mapping ImexEirGeneralPositions entity.
 * @author Samuel Pérez.
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GeneralPositionsDto {

	/**
	 * Section identifier.
	 * */
	private Integer identifier;

	/**
	 * General position description.
	 * */
	private String sectionDescription;

	/**
	 * Equipment type (Container, chassis, trailer).
	 * */
	private Integer eirTypeId;
}
