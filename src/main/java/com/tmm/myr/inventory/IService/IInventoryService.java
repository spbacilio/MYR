package com.tmm.myr.inventory.IService;

import java.util.List;

import com.tmm.myr.entrance.dto.ContainerDto;
import com.tmm.myr.inventory.dto.InventoryDto;

public interface IInventoryService {

	List<InventoryDto> getAll() throws Exception;
	
	Integer saveInventory(ContainerDto dto, String containerIdentifier) throws Exception;
}
