package com.tmm.myr.yard.IService;

import java.util.List;
import java.util.Map;

import org.hibernate.exception.SQLGrammarException;

import com.tmm.myr.base.exception.MyrException;
import com.tmm.myr.yard.dto.YardDto;;

/**
 * The objective of the YardController class is ...
 * 
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * 
 * */
public interface IYardService {

	/**
	 * Load all records.
	 * 
	 * @return List of yards.
	 * @throws MyrException MyrException
	 * */
	List<YardDto> getAll() throws MyrException;

	/**
	 * Fill the yard combo box.
	 * 
	 * @return Map of yard with status active.
	 * @throws MyrException MyrException
	 * */
	Map<String, String> yardComboBox() throws MyrException;

	/**
	 * Save a new yard.
	 * 
	 * @param name Name of yard.
	 * @throws MyrException MyrException
	 * */
	Boolean saveYard(String name) throws Exception;

	/**
	 * Delete a record according by id selected.
	 * @param identifier The id selected by user.
	 * */
	void deleteYard(Integer identifier) throws Exception;
	
	 List<YardDto> loadYardRelation(Integer terminalId) throws Exception;
	 
	 void saveYardRelation(Integer terminalId,
				Integer yardId,
				Integer active) throws Exception;
	 
	 void deleteYardRelation(Integer terminalId, Integer patioId) throws Exception;
	 
	 Integer validateRelationExistence(Integer terminalId, Integer patioId) throws Exception;
	
}
