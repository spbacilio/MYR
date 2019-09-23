package com.tmm.myr.entrance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmm.myr.base.bussiness.ContainerNameFormat;
import com.tmm.myr.base.constants.Constants;
import com.tmm.myr.entrance.IService.IImexContainerService;
import com.tmm.myr.entrance.converter.ImexContainerConverter;
import com.tmm.myr.entrance.dto.ContainerDto;
import com.tmm.myr.entrance.repository.ImexContainerRepository;

@Service
public class ImexContainerService implements IImexContainerService {

	@Autowired
	private ImexContainerConverter containerConverter;
	
	@Autowired
	private ImexContainerRepository containerRepository;
	
	@Override
	public Integer conteinerExistValidation(String containerName) throws Exception{
		Integer exist = 0;
		//String container = ContainerNameFormat.containerToFormatSQL(containerName, containerCode);
		ContainerDto dto = containerConverter.ObjectoToDto(containerRepository.findContainerById(containerName));	
		if (dto.getContainerIdentifier() != null) {
			exist = dto.getContainerIdentifier();
		}		
		return exist;
	}

	@Override
	public Integer saveContainer(String containerName, String containerCode, String itemType) throws Exception {
		String item = ContainerNameFormat.containerToFormatSQL(containerName.toUpperCase(), containerCode);
		Integer identifier = 0;
		if (itemType.equals(Constants.ITEM_TYPE)) {
			//Logica de negocio para chassis
		}
		else {
			containerRepository.saveContainer(item);
			ContainerDto dto = containerConverter.ObjectoToDto(containerRepository.findContainerById(item));
			identifier = dto.getContainerIdentifier();
		}
		return identifier;
	}

}
