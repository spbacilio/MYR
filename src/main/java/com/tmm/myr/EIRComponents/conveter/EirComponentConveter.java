package com.tmm.myr.EIRComponents.conveter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tmm.myr.EIRComponents.dto.EirComponentDto;
import com.tmm.myr.base.enums.Numbers;

/**
 * The main class for sections components.
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
@Component
public class EirComponentConveter {

	/**
	 * Convert a object list into dto list (GeneralPositionsDto).
	 * 
	 * @param objects List of generic objects.
	 * @return List of EirComponentDto objects.
	 * @throws Exception Exception.
	 * */
	public List<EirComponentDto> objectToDto(List<Object> objects) throws Exception {
		List<EirComponentDto> list = new ArrayList<>();
		objects.forEach(object -> {
			Object[] row = (Object[]) object;
			EirComponentDto dto = EirComponentDto.builder()
					.eirComponentIdentifier((Integer) Arrays.asList(row).get(Numbers.ZERO.getValue()))
					.component((String) Arrays.asList(row).get(Numbers.ONE.getValue()))
					.aarCode((String) Arrays.asList(row).get(Numbers.TWO.getValue()))					
					.build();
			list.add(dto);			
		});
		return list;
	}
}
