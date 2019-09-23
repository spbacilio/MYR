package com.tmm.myr.catMaritimeShippers.converter;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tmm.myr.base.enums.Numbers;

@Component
public class MaritimeShippersConverter {

	public Map<BigInteger, String> contertObjectToDto(List<Object> objects){
		Map<BigInteger, String> maritimeShippersMap = new HashMap<>();
		objects.forEach(object -> {
			Object[] row = (Object[]) object;
			maritimeShippersMap.put((BigInteger) Arrays.asList(row).get(Numbers.ZERO.getValue()),
					(String) Arrays.asList(row).get(Numbers.ONE.getValue()));
		});
		return maritimeShippersMap;		
	}
}
