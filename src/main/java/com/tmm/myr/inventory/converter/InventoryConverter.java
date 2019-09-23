package com.tmm.myr.inventory.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.tmm.myr.base.enums.Numbers;
import com.tmm.myr.inventory.dto.InventoryDto;

/**
 * The objective of the InventoryConverter class is ...
 * 
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * 
 * */
@Component
public class InventoryConverter {

	/**
	 * Convert a list of objects into dto.
	 * 
	 * @param objects.
	 * @return List of data transfer objects.
	 * */
	public List<InventoryDto> convertObjectToDto(List<Object> objects) {
		List<InventoryDto> objectList = new ArrayList<>();				
		objects.forEach(object -> {
			Object[] row = (Object[])object;
			InventoryDto dto = InventoryDto.builder()
			.inventoryId((Integer) Arrays.asList(row).get(Numbers.ZERO.getValue()))
			.container((String) Arrays.asList(row).get(Numbers.ONE.getValue()))
			.terminal((String) Arrays.asList(row).get(Numbers.TWO.getValue()))
			.dateAsignation((Date) Arrays.asList(row).get(Numbers.THREE.getValue()))
			.date((Date) Arrays.asList(row).get(4))
			.dateRegistered((Date) Arrays.asList(row).get(5))
			.year((Integer) Arrays.asList(row).get(6))
			.machinery((String) Arrays.asList(row).get(7))
			.technology((String) Arrays.asList(row).get(8))
			.subTipoGS((String) Arrays.asList(row).get(9))
			.plaque((String) Arrays.asList(row).get(10))
			.tipoRemolque((String) Arrays.asList(row).get(11))
			.condition((String) Arrays.asList(row).get(12))
			.origin((String) Arrays.asList(row).get(13))
			.operator((String) Arrays.asList(row).get(14))
			.build();
			objectList.add(dto);
		});
		return objectList;
	}
}
