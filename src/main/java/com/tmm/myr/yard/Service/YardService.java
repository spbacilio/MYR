package com.tmm.myr.yard.Service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.exception.SQLGrammarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmm.myr.base.entities.ImexCatpatios;
import com.tmm.myr.base.exception.MyrException;
import com.tmm.myr.base.utils.Identifier;
import com.tmm.myr.base.utils.MapFormatter;
import com.tmm.myr.yard.IService.IYardService;
import com.tmm.myr.yard.converter.YardConverter;
import com.tmm.myr.yard.dto.YardDto;
import com.tmm.myr.yard.repository.IYardRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * The objective of the YardController class is ...
 * 
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * 
 * */
@Slf4j
@Service
public class YardService implements IYardService {

	/**
	 * Yard repository.
	 * */
	@Autowired
	private IYardRepository yardRepository;

	/**
	 * Yard converter.
	 * */
	@Resource
	private YardConverter yardConverter;

	/**
	 * {@inheritDoc}
	 * */
	@Override
	public List<YardDto> getAll() {		
		return yardConverter.convertObjectToDto(yardRepository.finAllYards());
	}

	/**
	 * {@inheritDoc}
	 * */
	@Override
	public Map<String, String> yardComboBox() {
		return MapFormatter.orderMap(MapFormatter.objectToMap(yardRepository.findYardName()));
	}

	/**
	 * {@inheritDoc}
	 * */
	@Override
	public Boolean saveYard(String name) throws Exception {
		boolean ok = false;
		int recordsTotal = yardRepository.countRecords(name);
		if(recordsTotal == 0) {
			yardRepository.saveYard(1, name, 1, "L", 1, 1);
			ok = true;
		}		
		return ok;
	}

	@Override
	public void deleteYard(Integer identifier) throws Exception {
		yardRepository.deleteYard(identifier);
	}

	@Override
	public List<YardDto> loadYardRelation(Integer terminalId) throws Exception {		
		return yardConverter.convertObjects(yardRepository.findYardRelations(terminalId));
	}

	@Override
	public void saveYardRelation(Integer terminalId,
			Integer yardId,
			Integer active) throws Exception {
		yardRepository.saveYardRelations(terminalId, yardId, 1);
	}

	@Override
	public void deleteYardRelation(Integer terminalId, Integer patioId) throws Exception {
		yardRepository.deleteYardRelation(terminalId, patioId);
	}

	@Override
	public Integer validateRelationExistence(Integer terminalId, Integer patioId) throws Exception {						
		return yardRepository.findYarRelationById(terminalId, patioId);
	}

}
