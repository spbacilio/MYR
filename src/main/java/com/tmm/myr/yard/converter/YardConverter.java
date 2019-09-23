package com.tmm.myr.yard.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tmm.myr.base.enums.Numbers;
import com.tmm.myr.yard.dto.YardDto;

@Component
public class YardConverter {
	public List<YardDto> convertObjectToDto(List<Object> objectList){
		List<YardDto> yardList = new ArrayList<>();		
		objectList.forEach(object -> {			
			Object[] row = (Object[]) object;
			YardDto dto = YardDto.builder()
			.id((Integer) Arrays.asList(row).get(Numbers.ZERO.getValue()))			
			.nombrePatio((String) Arrays.asList(row).get(Numbers.ONE.getValue()))			
			.status((String) Arrays.asList(row).get(Numbers.TWO.getValue()))
			.build();		
			yardList.add(dto);
		});
		return yardList;
	}
	
	public List<YardDto> convertObjects(List<Object> objectList){
		List<YardDto> yardList = new ArrayList<>();
		objectList.forEach(object -> {			
			Object[] row = (Object[]) object;
			YardDto dto = YardDto.builder()					
			.nombrePatio((String) Arrays.asList(row).get(Numbers.ZERO.getValue()))			
			.id((Integer) Arrays.asList(row).get(Numbers.ONE.getValue()))
			.build();		
			yardList.add(dto);
		});
		return yardList;
	}
}
