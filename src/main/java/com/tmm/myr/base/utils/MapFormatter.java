package com.tmm.myr.base.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

import com.tmm.myr.base.enums.Numbers;

/**
 * The main class for map format.
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 */
public class MapFormatter {

	public static Map<String, String> objectToMap(List<Object> objects){
		Map<String, String> map = new HashMap<>();
		objects.forEach(object -> {
			Object[] row = (Object[]) object;
			Integer key = (Integer) Arrays.asList(row).get(Numbers.ZERO.getValue());
			String value = (String) Arrays.asList(row).get(Numbers.ONE.getValue());
			map.put(key.toString(), value);
		});
		return map;
	}

	public static Map<Integer, String> objectToMapInt(List<Object> objects){
		Map<Integer, String> map = new HashMap<>();
		objects.forEach(object -> {
			Object[] row = (Object[]) object;
			map.put((Integer) Arrays.asList(row).get(Numbers.ZERO.getValue()),
					(String) Arrays.asList(row).get(Numbers.ONE.getValue()));
		});
		return map;
	}
	
	
	public static Map<String, String> orderMap(Map<String, String> map){
		Map<String, String> mapSorted =
		map
		.entrySet()
		.stream()
		.sorted(comparingByKey())
		.collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
				(e1, e2) -> e2, LinkedHashMap::new));
		return mapSorted;
	}
}
