package com.tmm.myr.EIRLocation.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmm.myr.EIRLocation.converter.DamageLocationConverter;
import com.tmm.myr.EIRLocation.dto.DamageLocationDto;
import com.tmm.myr.EIRLocation.iservice.IDamageService;
import com.tmm.myr.EIRLocation.repository.IDamageLocationRepository;

@Service
public class DamageService implements IDamageService {
	
	@Resource
	private DamageLocationConverter damageLocationConverter;

	@Autowired
	private IDamageLocationRepository damageLocationRepository;
	
	@Override
	public List<DamageLocationDto> getAllDamageLocations(Integer eirTypeIdentifier,
			Integer componentIdentifier) throws Exception {		
		return damageLocationConverter.objectToDto(damageLocationRepository.
				findAllDamageRelationsByComponent(eirTypeIdentifier, componentIdentifier));
	}

}
