package com.tmm.myr.base.exception;

/**
 * The objective of the ConverterException class is ...
 * 
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * 
 * */
public class ConverterException extends Exception {

	/**
	 * Serial version id.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Return the customized exception.
	 * @param mensajeFinal The message.
	 * 
	 * */
	public ConverterException(final String mensajeFinal) {
		super(mensajeFinal);
	}

	/**
	 * Return the customized exception.
	 * 
	 * @param mensajeFinal The message.
	 * @param causaFinal Exception.
	 * 
	 * */
	public ConverterException(final String mensajeFinal,
			final Throwable causaFinal) {
		super(mensajeFinal, causaFinal);
	}
	
}
