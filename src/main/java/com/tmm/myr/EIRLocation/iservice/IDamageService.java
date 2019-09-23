package com.tmm.myr.EIRLocation.iservice;

import java.util.List;

import com.tmm.myr.EIRLocation.dto.DamageLocationDto;

public interface IDamageService {

	List<DamageLocationDto> getAllDamageLocations(Integer eirTypeIdentifier, Integer componentIdentifier) throws Exception;
}
