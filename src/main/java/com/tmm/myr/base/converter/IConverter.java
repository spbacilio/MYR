package com.tmm.myr.base.converter;

import com.tmm.myr.base.dto.ITransferObject;
import com.tmm.myr.base.entities.IEntity;
import com.tmm.myr.base.exception.ConverterException;

/**
 * The objetive the Interface IConverter.java is ...
 * 
 * @param <E> The element type.
 * @param <T> The generic type.
 * 
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * 
 * 
 * 
 * */
public interface IConverter<E extends IEntity, T extends ITransferObject> {

	/**
	 * Convert a data transfer object into Entity.
	 *
	 * @param dto Data transfer object.
	 * @return The entity.
	 * 
	 * @throws ConverterException Return the exception.
	 * */
	E convert(T dto) throws ConverterException;

	/**
	 * Convert a Entity into data transfer object.
	 * 
	 * @param entity The entity selected.
	 * 
	 * @return The data transfer object.
	 * @throws ConverterException Return the exception.
	 * */
	T convert(E entity) throws ConverterException;
}
