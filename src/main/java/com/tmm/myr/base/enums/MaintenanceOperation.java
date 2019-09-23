package com.tmm.myr.base.enums;

/**
 * The objetive the Interface MaintenanceOperation.java is ...
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * */
public enum MaintenanceOperation {

	/**
	 * Insert.
	 * */
	INSERT("INSERT"),
	
	/**
	 * Update.
	 * */
	UPDATE("UPDATE"),
	
	/**
	 * Delete.
	 * */
	DELETE("DELETE"),

	/**
	 * Select.
	 * */
	SELECT("SELECT"),

	/**
	 * None.
	 * */
	NONE("NONE");

	/**
	 * String value from enumeration.
	 * */
	private String value;

	/**
	 * Get value from enumeration.
	 * */
	MaintenanceOperation(String value){
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
	public static MaintenanceOperation getOperation(String operation) {
		for(MaintenanceOperation operaciones : MaintenanceOperation.values()) {
			if(operation.equals(operaciones.getValue())) {
				return operaciones;
			}
		}
		return MaintenanceOperation.NONE;
	}
}
