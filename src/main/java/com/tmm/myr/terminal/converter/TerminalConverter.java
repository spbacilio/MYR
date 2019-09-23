package com.tmm.myr.terminal.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tmm.myr.base.enums.Numbers;
import com.tmm.myr.terminal.dto.TerminalDto;

@Component
public class TerminalConverter {

	public List<TerminalDto> convertObjects(List<Object> objects){
		List<TerminalDto> list = new ArrayList<>();
		objects.forEach(object -> {
			Object[] row = (Object[]) object;
			TerminalDto dto = TerminalDto.builder()
					.identifier((Integer) Arrays.asList(row).get(Numbers.ZERO.getValue()))
					.description((String) Arrays.asList(row).get(Numbers.ONE.getValue()))
					.code((String) Arrays.asList(row).get(Numbers.TWO.getValue()))
					.build();
			list.add(dto);
		});
		return list;
	}
}
