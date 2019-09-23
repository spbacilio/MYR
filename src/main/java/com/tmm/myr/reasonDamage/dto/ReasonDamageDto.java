package com.tmm.myr.reasonDamage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The main class for mapping ImexReasonDamage entity.
 * @author Samuel Pérez.
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ReasonDamageDto {

	/**
	 * Reason damage identifier field.
	 * */
	private Integer reasonDamageIdentifier;

	/**
	 * Reason damage description field.
	 * */
	private String reasonDamageDescription;
}
