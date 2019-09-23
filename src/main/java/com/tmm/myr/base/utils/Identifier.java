package com.tmm.myr.base.utils;

/**
 * The objective of the Identifier class is ...
 * 
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * 
 * */
public class Identifier {

	/**
	 * Set id.
	 * 
	 * @param id Id of table selected.
	 * @return The new Id.
	 * */
	public static Integer setIdentifier(Long id) {
		Integer identifier = 0;
		if(id == 0 || id == null) {
			identifier = 1;
		}
		else {
			identifier = id.intValue() + 1;
		}
		return identifier;
	}
}
