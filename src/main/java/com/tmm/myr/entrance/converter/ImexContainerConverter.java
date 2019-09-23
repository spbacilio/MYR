package com.tmm.myr.entrance.converter;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.tmm.myr.base.enums.Numbers;
import com.tmm.myr.entrance.dto.ContainerDto;

@Component
public class ImexContainerConverter {

	public ContainerDto ObjectoToDto(Object object) {
		ContainerDto dto = ContainerDto.builder().build();
		if(object != null) {
			Object[] row = (Object[]) object;
			dto.setContainerIdentifier((Integer) Arrays.asList(row).get(Numbers.ZERO.getValue()));
			dto.setContainerName((String) Arrays.asList(row).get(Numbers.ONE.getValue()));
		}
		return dto;
	}
}
