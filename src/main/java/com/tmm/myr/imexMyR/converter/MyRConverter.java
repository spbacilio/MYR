package com.tmm.myr.imexMyR.converter;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tmm.myr.base.utils.DateFormatter;
import com.tmm.myr.entrance.dto.ContainerDto;
import com.tmm.myr.imexMyR.Dto.Master;
import com.tmm.myr.imexMyR.Dto.MyRDto;
import com.tmm.myr.imexMyR.Service.MyRService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class MyRConverter {

	public MyRDto containertoMyR(ContainerDto dto, Integer containerId, Integer inventoryId) {
		MyRDto data = MyRDto.builder()
				.cycleCode(0)
				.containerId(containerId)
				.chassisId(0)
				.terminalId(dto.getTerminalId())
				.dateCompleted(new Date())
				.userImexId("4")
				.commentsCont("")
				.commentsChas("")
				.daniosId(3)
				.clasificacionId(6)
				.tamaniosId(dto.getContainerSize())
				.daniosChId(0)
				.tamaniosChId(0)//Tamaño de chasis
				.shipperId(dto.getOwnerIdentifier())
				.tipoEirId(1)
				.tipoInspeccionId(1)
				.driverId(0)
				.serviceGroupId(inventoryId)
				.build();
		return data;
	}
	
	public Master objectToMaster(List<Object> object) {
		log.info("objectToMaster: ", object.toString());
		
		Object[] row =(Object[]) object.get(0);
		Master data = Master.builder()
				.myrId((Integer) Arrays.asList(row).get(0))
				.terminalId((Integer) Arrays.asList(row).get(1))
				.terminalName((String) Arrays.asList(row).get(2)) 
				.dateCompleted((Date) Arrays.asList(row).get(3)) 
				.daniosId((Integer) Arrays.asList(row).get(4))
				.daniosDescripcion((String) Arrays.asList(row).get(5)) 
				.clasificacionId((Integer) Arrays.asList(row).get(6))
				.clasificacionDescripcion((String) Arrays.asList(row).get(7)) 
				.tamaniosId((Integer) Arrays.asList(row).get(8))
				.tamaniosclv((String) Arrays.asList(row).get(9)) 
				.tamaniosDescripcion((String) Arrays.asList(row).get(10)) 
				.tamaniosChId((Integer) Arrays.asList(row).get(11))
				.shipperId(BigInteger.ONE)
				.shipperDescription("1")
				.tipoEirId((Integer) Arrays.asList(row).get(14))
				.tipoEIR((String) Arrays.asList(row).get(15)) 
				.tipoInspeccion((String) Arrays.asList(row).get(16)) 				
				.userImexId((String) Arrays.asList(row).get(17))
				.containerId((Integer) Arrays.asList(row).get(18))
				.Container((String) Arrays.asList(row).get(19)) 
				.chassisId((Integer) Arrays.asList(row).get(20)) 
				.tipoInspeccionId((Integer) Arrays.asList(row).get(21)) 
				.serviceGroupId((Integer) Arrays.asList(row).get(22))
				.CommentsChas((String) Arrays.asList(row).get(23))
				.CommentsCont((String) Arrays.asList(row).get(24))
				.daniosChId((Integer) Arrays.asList(row).get(25))
				.timeCompleted(DateFormatter.DateToString((Date) Arrays.asList(row).get(3)))
				.build();
		return data;
	}
}
