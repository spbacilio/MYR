package com.tmm.myr.base.exception;

/**
 * The objective of the MyrException class is ...
 * 
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * 
 * */
public class MyrException extends Exception {

	/**
	 * Serial id.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Arroja la excepcion personalizada.
	 * @param mensajeFinal the message.
	 */
	public MyrException(final String mensajeFinal) {
		super(mensajeFinal);
	}

	/**
	 * Arroja la excepcion personalizada.
	 * @param mensajeFinal Mensaje a especificar para la excepcion.
	 * @param causaFinal Causa de la excepcion.
	 */
	public MyrException(final String mensajeFinal, final Throwable causaFinal) {
		super(mensajeFinal, causaFinal);
	}
	
}
