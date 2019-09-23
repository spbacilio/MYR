package com.tmm.myr.terminal.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmm.myr.base.entities.ImexTerminal;
import com.tmm.myr.base.utils.Identifier;
import com.tmm.myr.base.utils.MapFormatter;
import com.tmm.myr.terminal.IService.ITerminalService;
import com.tmm.myr.terminal.converter.TerminalConverter;
import com.tmm.myr.terminal.dto.TerminalDto;
import com.tmm.myr.terminal.repository.ITerminalRepository;

@Service
public class TerminalService implements ITerminalService {

	@Autowired
	private ITerminalRepository terminalRepository;
	
	@Resource
	private TerminalConverter converter;
	
	@Override
	public Map<String, String> fillComboBox() {
		return MapFormatter.orderMap(MapFormatter.objectToMap(terminalRepository.findTerminals()));
	}

	@Override
	public List<TerminalDto> getAllTerminals() throws Exception {		
		return converter.convertObjects(terminalRepository.findTerminals());		
	}

	@Override
	public void saveTerminal(String name, String code) throws Exception {
		Integer terminalIdentifier = Identifier.setIdentifier(terminalRepository.findId());
		System.out.println("ID TERMINAL: " + terminalIdentifier + " Name: " + name + " Code: " + code);		
		terminalRepository.saveTerminal(terminalIdentifier, name, code, 1);
	}

	@Override
	public void deleteTerminal(Integer identifier) throws Exception {
		terminalRepository.deleteTerminal(identifier);
	}

}
