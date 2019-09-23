package com.tmm.myr.base.enums;

public enum Status {
	
	/**
	 * Operation success.
	 * */
	SUCCESS("SUCCESS"),
	
	/**
	 * Operation error.
	 * */
	ERROR("ERROR"),
	
	/**
	 * Operation warn.
	 * */
	WARN("WARN"),
	
	/**
	 * Operation none.
	 * */
	NONE("NONE");
	
	/**
	 * String value from enumeration.
	 * */
	private String value;

	/**
	 * Get value from enumeration.
	 * */
	Status(String value){
		this.value = value;
	}

	/**
	 * Get the string value from enumeration.
	 * @return Current value.
	 * */
	public String getValue() {
		return this.value;
	}

	/**
	 * Get the enum from the value.
	 * @param value the value.
	 * @return The current operation.
	 */
	public static Status getOperation(String operation) {
		for(Status operaciones : Status.values()) {
			if(operation.equals(operaciones.getValue())) {
				return operaciones;
			}
		}
		return Status.NONE;
	}
}
