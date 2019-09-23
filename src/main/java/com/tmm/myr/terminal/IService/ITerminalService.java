package com.tmm.myr.terminal.IService;

import java.util.Map;

import com.tmm.myr.terminal.dto.TerminalDto;

import java.util.List;

public interface ITerminalService {

	Map<String, String> fillComboBox();
	
	List<TerminalDto> getAllTerminals() throws Exception;
	
	void saveTerminal(String name, String code) throws Exception;
	
	/**
	 * Delete a record according by id selected.
	 * @param identifier The id selected by user.
	 * */
	void deleteTerminal(Integer identifier) throws Exception;
}
