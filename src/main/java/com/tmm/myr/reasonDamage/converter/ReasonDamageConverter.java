package com.tmm.myr.reasonDamage.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tmm.myr.base.enums.Numbers;
import com.tmm.myr.reasonDamage.dto.ReasonDamageDto;

/**
 * The main class converter for Reason damage module.
 * 
 * @author Samuel Pérez.
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
@Component
public class ReasonDamageConverter {

	/**
	 * Convert a list of generic objects into data transfer object list.
	 * 
	 * @param objectsList List of objects received.
	 * 
	 * @return ReasonDamageDto list.
	 * @throws Exception Exception.
	 * */
	public List<ReasonDamageDto> objectToDto(List<Object> objectsList) throws Exception {
		List<ReasonDamageDto> reasonDamageList = new ArrayList<>();
		objectsList.forEach(object -> {
			Object[] row = (Object[]) object;
			ReasonDamageDto dto = ReasonDamageDto.builder()
					.reasonDamageIdentifier((Integer) Arrays.asList(row).get(Numbers.ZERO.getValue()))
					.reasonDamageDescription((String) Arrays.asList(row).get(Numbers.ONE.getValue()))
					.build();
			reasonDamageList.add(dto);
		});
		return reasonDamageList;
	}
}
