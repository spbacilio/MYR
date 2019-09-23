package com.tmm.myr.imexMyR.Dto;

import java.math.BigInteger;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class MyRDto {

	private Integer cycleCode;

	private Integer containerId;

	private Integer chassisId;

	private Integer terminalId;

	private Date dateCompleted;

	private String userImexId;

	private String commentsCont;

	private String commentsChas;

	private Integer daniosId;

	private Integer clasificacionId;

	private Integer tamaniosId;

	private Integer daniosChId;

	private Integer tamaniosChId;

	private BigInteger shipperId;

	private Integer tipoEirId;

	private Integer tipoInspeccionId;

	private Integer driverId;

	private Integer serviceGroupId;
	
	private String sectionIdentifier;
	
	private String eirComponentIdentifier;
	
	private String reasonDamageIdentifier;
}
