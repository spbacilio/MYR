package com.tmm.myr.imexMyR.Dto;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import com.tmm.myr.entrance.dto.ContainerDto;
import com.tmm.myr.entrance.dto.ContainerDto.ContainerDtoBuilder;

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
public class Imex_MandRMaster {

    private String containerId;

    private String container;

    private Integer myRId;
    
    private Integer serviceGroupId;
    
    private Integer terminalId;
    
    private String terminalName;
    
    private Date dateCompleted;
    private String timeCompleted;
    private Integer chassisId;
    
    private String daniosDescripcion;
    
    private Integer clasificacionId;
    
    private String clasificacionDescripcion;
    
    private Integer tamaniosId;
    
    private String tamaniosclv;
    
    private String tamaniosDescripcion;
    
    private Integer daniosChId;
    
    private Integer shipperId;
    
    private String maritimeShippersDescripcion;
    
    private Integer tipoEirId;
    
    private String tipoEIR;
    
    private Integer tipoInspeccionId;
    
    private String tipoInspeccion;
    
    private String associate;
    
    private String mensajeError;
    
    private Integer numeroError;
    
    private Integer cycleCode;
    
    private String userImexId;
    
    private String commentsCont;
   
    private String commentsChas;
    
    private Integer daniosId;
    
    private Integer tamaniosChId;
    
    private List<Imex_MandRDetail> detalle;
    
    private Integer tipoEquipo;
    
    private String chassis;
    
    private List<Imex_MandRRepair> repair;
    
    private List<Imex_HeaderPhoto> equipmentPhoto;
}
