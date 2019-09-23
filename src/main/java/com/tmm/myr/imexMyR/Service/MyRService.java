package com.tmm.myr.imexMyR.Service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmm.myr.entrance.dto.ContainerDto;
import com.tmm.myr.imexMyR.Dto.Imex_MandRMaster;
import com.tmm.myr.imexMyR.Dto.Master;
import com.tmm.myr.imexMyR.Dto.MyRDto;
import com.tmm.myr.imexMyR.IService.IMyrService;
import com.tmm.myr.imexMyR.controller.MyRController;
import com.tmm.myr.imexMyR.converter.MyRConverter;
import com.tmm.myr.imexMyR.repository.IMyRRepository;
import com.tmm.myr.stockView.converter.StockViewConverter;
import com.tmm.myr.stockView.dto.StockViewDto;
import com.tmm.myr.users.dto.UserDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MyRService implements IMyrService {
	
	@Autowired
	private IMyRRepository MyRRepository;
	
	@Resource
	private MyRConverter converter;
	
	@Resource
	private StockViewConverter stockViewConverter;

	@Override
	public void saveMyR(ContainerDto dto, Integer containerIdentifier,  Integer inventoryId) throws Exception {
		MyRDto data = converter.containertoMyR(dto, containerIdentifier, inventoryId);
		MyRRepository.saveMyR(data.getCycleCode(),
				data.getContainerId(), 
				data.getChassisId(), 
				data.getTerminalId(), 
				data.getDateCompleted(),
				data.getUserImexId(), 
				data.getCommentsCont(), 
				data.getCommentsChas(), 
				data.getDaniosId(), 
				data.getClasificacionId(), 
				data.getTamaniosId(), 
				data.getDaniosChId(), 
				data.getTamaniosChId(), 
				data.getShipperId(), 
				data.getTipoEirId(), 
				data.getTipoInspeccionId(), 
				data.getDriverId(), 
				data.getServiceGroupId());
		
	}

	@Override
	public Imex_MandRMaster CosultaEquipoPorContenedor(String contenedor, Integer containerId, UserDto user) {
		//Checa que el contenedor este dado de alta
		log.error("Contenedor: {}", contenedor);
		log.error("Contenedor Id: {}", containerId);
		log.error("Terminal id: {}", user.terminalId);
		
		StockViewDto inventory = stockViewConverter.converter(MyRRepository.findStockView(contenedor, user.terminalId));
		log.info("Inventario: {}", inventory.toString());
		Imex_MandRMaster myr = new Imex_MandRMaster();
		if(inventory.getContainerName() == null) {
			Imex_MandRMaster dto = Imex_MandRMaster.builder()
					.mensajeError("Contendor no encontrado ó formato del contenedor es incorrecto.")
					.numeroError(2)
					.build();
			myr = dto;
		}
		else {
			//Obteniendo informacion del ultimo movimiento del contenedor
			myr = getHistory(containerId, user.getTerminalId());
			
		}
		return myr;
	}
	
	public Imex_MandRMaster getHistory(Integer containerId, Integer terminalId) {	
		Master master = converter.objectToMaster(MyRRepository.findMyRViews(containerId, terminalId));
		Imex_MandRMaster finalDto = Imex_MandRMaster.builder().build();
		log.info("Master: {}", master.toString());
		if(master.getTerminalName() == null) {
			Imex_MandRMaster myrdto = Imex_MandRMaster.builder()
					.mensajeError("J1 o J2 No encontrado.")
					.numeroError(4)
					.build();
			finalDto = myrdto;
		}
		else {
			Imex_MandRMaster myr = Imex_MandRMaster.builder()
					 .chassisId(1)
		             .associate("Sin equipo")
		             .userImexId(master.getUserImexId().toString())
		             .containerId(master.getContainerId().toString())
		             .container(master.getContainer())
		             .myRId(master.getMyrId())		             
		             .terminalId(master.getTerminalId() == null ? 0 : master.getTerminalId())
		             .terminalName(master.getTerminalName())
		             .dateCompleted(master.getDateCompleted())
		             .timeCompleted(master.getTimeCompleted())
		             .chassisId(master.getChassisId() == null ? 0 : master.getChassisId())
		             .daniosDescripcion(master.getDaniosDescripcion())
		             .clasificacionId(master.getClasificacionId() == null ? 0 : master.getClasificacionId())
		             .clasificacionDescripcion(master.getClasificacionDescripcion())
		             .tamaniosId(master.getTamaniosId() == null ? 0 : master.getTamaniosId())
		             .tamaniosclv(master.getTamaniosclv())
		             .tamaniosDescripcion(master.getTamaniosDescripcion())
		             .daniosId(master.getDaniosId() == null ? 0 : master.getDaniosId())
		             .daniosChId(master.getDaniosChId() == null ? 0 : master.getDaniosChId())
		             .tamaniosChId(master.getTamaniosChId() == null ? 0 : master.getTamaniosChId())
		             .shipperId(1)// Convert.ToInt64(inventario.ShipperId);
		             .maritimeShippersDescripcion("1")// inventario.ShippersDescription;
		             .tipoEirId(master.getTipoEirId())
		             .tipoEIR(master.getTipoEIR())
		             .tipoInspeccionId(master.getTipoInspeccionId())
		             .tipoInspeccion(master.getTipoInspeccion())
		             .tipoEquipo(0)
		             .serviceGroupId(master.getServiceGroupId())
		             .commentsChas(master.getCommentsChas())
		             .commentsCont(master.getCommentsCont())
		             .mensajeError("Consulta OK.")
		             .numeroError(0)
		             .build();
            
             /*
              * Buscando Fotos Asociadas al contenedor
              */
			
			  /*
             * Buscando daños registrados al contenedor
             */
			  /*
             * Buscando reparaciones
             */
			 /*
             * Buscando fotos asociadas a la reparacion
             */
			 /*
             * Buscando fotos asociadas al daño
             */

			finalDto = myr;
		}
		
		return finalDto;
	}

}
