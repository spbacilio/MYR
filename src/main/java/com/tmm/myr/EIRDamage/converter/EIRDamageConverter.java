package com.tmm.myr.EIRDamage.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tmm.myr.EIRDamage.Dto.EIRDamageDto;
import com.tmm.myr.base.enums.Numbers;

/**
 * The main converter class for EIR damage module.
 * 
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
@Component
public class EIRDamageConverter {

	/**
	 * Convert a object list into dto list (EIRDamageDto).
	 * 
	 * @param objects List of generic objects.
	 * @return List of EIRDamageDto objects.
	 * @throws Exception Exception.
	 * */
	public List<EIRDamageDto> objectToDto(List<Object> objetcList) throws Exception {
		List<EIRDamageDto> dataTransferList = new ArrayList<>();
		objetcList.forEach(object -> {
			Object[] row = (Object[])object;
			EIRDamageDto dto = EIRDamageDto.builder()
					.eirDamageIdentifier((Integer) Arrays.asList(row).get(Numbers.ZERO.getValue()))
					.damageDescription((String) Arrays.asList(row).get(Numbers.ONE.getValue()))
					.aarCode((String) Arrays.asList(row).get(Numbers.TWO.getValue()))
					.EIRTypeIdentifier((Integer) Arrays.asList(row).get(Numbers.THREE.getValue()))
					.build();
			dataTransferList.add(dto);
		});
		return dataTransferList;
	}
}
