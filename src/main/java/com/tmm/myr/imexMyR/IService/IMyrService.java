package com.tmm.myr.imexMyR.IService;

import com.tmm.myr.entrance.dto.ContainerDto;
import com.tmm.myr.imexMyR.Dto.Imex_MandRMaster;
import com.tmm.myr.users.dto.UserDto;

public interface IMyrService {

	void saveMyR(ContainerDto dto, Integer containerIdentifier,  Integer inventoryId) throws Exception;
	
	Imex_MandRMaster CosultaEquipoPorContenedor(String Contenedor, Integer containerId, UserDto user);
}
