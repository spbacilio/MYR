package com.tmm.myr.inventory.dto;

import java.math.BigInteger;
import java.util.Date;

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
public class InventoryDto {

	/**
	 * Id of inventory.
	 * */
	private Integer inventoryId;
	
	/**
	 * Name of container.
	 * */
	private String container;
	
	/**
	 * Name of terminal.
	 * */
	private String terminal;
	
	/**
	 * Date.
	 * */
	private Date date;
	
	private Integer positionIdentifier;
	private String position;
	private Integer yardIdentifier;
	private Boolean ocuped;
	private String userIdentifier;
	private Date dateAsignation;
	private String guia;
	private Integer chassisIdentifier;		
	private String containerIdentifier;
    private Integer reservationIndentifier;
    private BigInteger shipperIdentifier;
    private Integer tipoServicioIdentifier;
    private Integer terminalIdentifier;
    private Date fechaEscritura;
    private String booking;
    private String tranTypeIdentifier;
    private Date dateRegistered;
    private String terminalAnteriorIdentifier;
    private Boolean reservadoTerminal;
    private String sello;
    private String IdTrackingSir;
    private Integer year;
    private String condition;
    private String machinery;
    private String origin;
    private String plaque;
    private String subTipoGS;
    private String technology;
    private String tipoRemolque;
    private String operator;
    private Boolean isActive;
}
