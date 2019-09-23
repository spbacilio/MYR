package com.tmm.myr.entrance.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class ContainerDto {
	
	/**
	 * Container indentifier number.
	 * */
	private Integer containerIdentifier;

	/**
	 * Container name.
	 * */
	private String containerName;

	/**
	 * Container owner
	 * */
	private BigInteger ownerIdentifier;
	
	/**
	 * Container size.
	 * */
	private Integer containerSize;
	
	/**
	 * Container plaque.
	 * */
	private String plaque;

	/**
	 * Trailer type (Only trailers).
	 * */
	private String trailerType;

	/**
	 * Year.
	 * */
	private String year;
	
	/**
	 * Machinery type.
	 * */
	private String machineryType;
	
	/**
	 * Container technology (Only Reefer).
	 * */
	private String technology;

	/**
	 * Sub type gs.
	 * */
	private String gsSubType;

	/**
	 * Container condition.
	 * */
	private String condition;

	/**
	 * Container origin.
	 * */
	private String origin;
	
	/**
	 * Terminal id.
	 * */
	private Integer terminalId;

	/**
	 * Name of operator.
	 * */
	private String operator;

}
