package com.tmm.myr.base.enums;

/**
 * The objetive the Interface Numbers.java is ...
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * */
public enum Numbers {

	/**
	 * Zero.
	 * */
	ZERO(0),
	
	/**
	 * One.
	 * */
	ONE(1),
	
	/**
	 * Two.
	 * */
	TWO(2),
	
	/**
	 * Three.
	 * */
	THREE(3),

	/**
	 * Four.
	 * */
	FOUR(4),

	/**
	 * Five.
	 * */
	FIVE(5),

	/**
	 * Six
	 * */
	SIX(6);
	
	/**
	 * Integer value from enumeration.
	 * */
	private Integer value;

	/**
	 * Creates a new number object.
	 * @param intValue Integer value.
	 * */
	Numbers(final Integer intValue){
		value = intValue;
	}

	/**
	 * Get the enum from the value.
	 * @param value the value
	 * @return the enum numero magico evolv.
	 */
	public static Numbers getByValue(final Integer value) {
		for(Numbers number : Numbers.values()) {
			if(value == number.getValue()) {
				return number;
			}
		}
		return Numbers.ZERO;
	}
	
	/**
	 * Get the int value from a enumeration item.
	 * @return the value.
	 */
	public Integer getValue() {

		return value;
	}
}
