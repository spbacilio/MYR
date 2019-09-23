package com.tmm.myr.stockView.converter;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.tmm.myr.base.enums.Numbers;
import com.tmm.myr.stockView.dto.StockViewDto;

@Component
public class StockViewConverter {
	
	public StockViewDto converter(Object object) {
		System.out.println("Objecto a convertir: " + object);
		if(object == null) {
			StockViewDto data = StockViewDto.builder().build();
			return data; 
		}
		Object[] row = (Object[]) object;
		StockViewDto data = StockViewDto.builder()
				.containerName((String) Arrays.asList(row).get(Numbers.ZERO.getValue()))
				.terminalIdentifier((Integer) Arrays.asList(row).get(Numbers.ONE.getValue()))
				.build();
		return data;
	}
}
