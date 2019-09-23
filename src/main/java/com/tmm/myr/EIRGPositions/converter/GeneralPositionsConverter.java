package com.tmm.myr.EIRGPositions.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tmm.myr.EIRGPositions.dto.GeneralPositionsDto;
import com.tmm.myr.base.enums.Numbers;

/**
 * The main class for sections components.
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
@Component
public class GeneralPositionsConverter {

	/**
	 * Convert a object list into dto list (GeneralPositionsDto).
	 * */
	public Map<Integer, GeneralPositionsDto> objectToDto(List<Object> objects) throws Exception {
		Map<Integer, GeneralPositionsDto> map = new HashMap<>();
		objects.forEach(object -> {
			Object[] row = (Object[]) object;
			GeneralPositionsDto dto = GeneralPositionsDto.builder()
					.identifier((Integer) Arrays.asList(row).get(Numbers.ZERO.getValue()))
					.sectionDescription((String) Arrays.asList(row).get(Numbers.ONE.getValue()))
					.eirTypeId((Integer) Arrays.asList(row).get(Numbers.TWO.getValue()))					
					.build();
			System.out.println(dto.toString());
			map.put(dto.getIdentifier(), dto);
		});
		return map;
	}
}
