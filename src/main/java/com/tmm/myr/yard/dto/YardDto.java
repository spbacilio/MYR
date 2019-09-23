package com.tmm.myr.yard.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class YardDto {

	/**
	 * Id yard.
	 * */
	private Integer id;
	
	/**
	 * Name of yard.
	 * */
	private String nombrePatio;

	/**
	 * Status of yard.
	 * */
	private String status;

	/**
	 * Active value.
	 * */
	private boolean active;

	/**
	 * Terminal id.
	 * */
	private Integer terminalId;

	
	

}
