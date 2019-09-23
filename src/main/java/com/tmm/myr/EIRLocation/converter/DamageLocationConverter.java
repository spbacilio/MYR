package com.tmm.myr.EIRLocation.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tmm.myr.EIRLocation.dto.DamageLocationDto;
import com.tmm.myr.base.enums.Numbers;

@Component
public class DamageLocationConverter {

	public List<DamageLocationDto> objectToDto(List<Object> damageLocationList){
		 List<DamageLocationDto> list = new ArrayList<>();
		 damageLocationList.forEach(object -> {
			 Object[] row = (Object[]) object;
			 DamageLocationDto dto = DamageLocationDto.builder()
					 .damagelocation((String) Arrays.asList(row).get(Numbers.ZERO.getValue()))
					 .aarCode((String) Arrays.asList(row).get(Numbers.ONE.getValue()))
					 .build();
			 list.add(dto);
		 });
		 return list;
	}
}
