package com.tmm.myr.inventory.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmm.myr.entrance.controller.EntranceController;
import com.tmm.myr.entrance.dto.ContainerDto;
import com.tmm.myr.inventory.IService.IInventoryService;
import com.tmm.myr.inventory.converter.InventoryConverter;
import com.tmm.myr.inventory.dto.InventoryDto;
import com.tmm.myr.inventory.repository.IInventoryRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class InventoryService implements IInventoryService {

	@Autowired
	private IInventoryRepository inventoryRepository;

	@Resource
	private InventoryConverter converter;
	
	@Override
	public List<InventoryDto> getAll() throws Exception{
		List<InventoryDto> list = converter.convertObjectToDto(inventoryRepository.findInventories());
		return list;
	}

	@Override
	public Integer saveInventory(ContainerDto dto, String containerId) throws Exception {
		Integer identifier = 0;
		InventoryDto stock = convertContainerIntoInventory(dto,containerId);
		log.info("Stock: {}", stock.toString());
		inventoryRepository.saveInventory(
				stock.getPositionIdentifier(),
				stock.getPosition(), 
				stock.getYardIdentifier(),
				stock.getOcuped(),
				stock.getUserIdentifier(), 
				stock.getDateAsignation(), 
				stock.getGuia(), 
				stock.getChassisIdentifier(),
				stock.getContainerIdentifier(), 
				stock.getReservationIndentifier(), 
				stock.getShipperIdentifier(), 
				
				stock.getTipoServicioIdentifier(),
				stock.getTerminalIdentifier(),
				stock.getFechaEscritura(), 
				stock.getBooking(),
				stock.getTranTypeIdentifier(), 
				stock.getDateRegistered(),
				stock.getTerminalAnteriorIdentifier(), 
				stock.getReservadoTerminal(), 
				stock.getSello(),				
				stock.getIdTrackingSir(), 
				stock.getIsActive(),				
				stock.getYear().toString(), 
				stock.getMachinery(),
				stock.getTechnology().toUpperCase(), 
				stock.getSubTipoGS().toUpperCase(),
				stock.getPlaque().toUpperCase(),
				stock.getTipoRemolque(),				
				stock.getCondition(),				 
				stock.getOrigin(),				 								 				
				 stock.getOperator().toUpperCase()				 
				 );
		identifier = inventoryRepository.findInventoryIdentifier(Integer.parseInt(containerId),
				dto.getTrailerType(), dto.getOrigin(), dto.getOperator());
		return identifier;
	}
	
	private InventoryDto convertContainerIntoInventory(ContainerDto dto, String containerId) {
		InventoryDto stock = InventoryDto.builder()
				.positionIdentifier(1)
				.position("1")
				.yardIdentifier(1)
				.ocuped(true)
				.userIdentifier("4")
				.dateAsignation(new Date())
				.guia("")
				.chassisIdentifier(0)
				.containerIdentifier(containerId)
				.reservationIndentifier(1)
				.shipperIdentifier(dto.getOwnerIdentifier())
				.terminalIdentifier(dto.getTerminalId())
				.fechaEscritura(new Date())
				.booking(null)
				.tranTypeIdentifier(null)
				.dateRegistered(new Date())
				.terminalAnteriorIdentifier(null)
				.reservadoTerminal(false)
				.sello("")
				.IdTrackingSir(null)
				.year(Integer.parseInt(dto.getYear()))
				.condition(dto.getCondition())
				.machinery(dto.getMachineryType())
				.origin(dto.getOrigin())
				.plaque(dto.getPlaque())
				.subTipoGS(dto.getGsSubType())
				.technology(dto.getTechnology())
				.tipoRemolque(dto.getTrailerType())
				.operator(dto.getOperator())
				.isActive(true)
				.build();
		return stock;
	}

}
