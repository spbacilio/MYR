package com.tmm.myr.imexMyR.Dto;

import java.math.BigInteger;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Master {

	private String userImexId;
	private Integer containerId;
	private String Container; 
	private Integer myrId;
	private Integer terminalId;
	private String terminalName; 
	private Date dateCompleted; 
	private Integer chassisId; 
	private String daniosDescripcion; 
	private Integer clasificacionId;
	private String clasificacionDescripcion; 
	private Integer tamaniosId;
	private String tamaniosclv; 
	private String tamaniosDescripcion; 
	private Integer daniosId;
	private Integer daniosChId;
	private Integer tamaniosChId;
	private Integer tipoEirId; 
	private String tipoEIR; 
	private Integer tipoInspeccionId; 
	private String tipoInspeccion; 
	private Integer serviceGroupId;
	private String CommentsChas;
	private String CommentsCont;
	private BigInteger shipperId;
	private String shipperDescription;
	private String timeCompleted;
}
