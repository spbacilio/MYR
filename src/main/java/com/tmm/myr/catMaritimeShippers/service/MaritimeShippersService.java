package com.tmm.myr.catMaritimeShippers.service;

import java.math.BigInteger;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmm.myr.catMaritimeShippers.IService.IMaritimeShippersService;
import com.tmm.myr.catMaritimeShippers.converter.MaritimeShippersConverter;
import com.tmm.myr.catMaritimeShippers.repository.ICatMaritimeshippersRepository;

@Service
public class MaritimeShippersService implements IMaritimeShippersService {
	
	@Autowired
	private ICatMaritimeshippersRepository maritimeshippersRepository;
	
	@Resource
	private MaritimeShippersConverter maritimeShippersConverter;

	@Override
	public Map<BigInteger, String>  fillComboBoxControl() throws Exception {				
		return maritimeShippersConverter.contertObjectToDto(maritimeshippersRepository.findPropietary());
	}

}
