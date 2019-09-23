package com.tmm.myr.inventory.repository;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tmm.myr.base.entities.ImexInventario;

@Repository
public interface IInventoryRepository extends JpaRepository<ImexInventario, Integer> {

	/**
	 * Load main page.
	 * */
	@Query(value = "SELECT i.InventarioId," + 
			"				s.Container," + 
			"				s.Descripcion," + 
			"				i.FechaAsignacion, " + 
			"				i.FechaEscritura," + 
			"				i.DateRegistered," + 
			"				i.anio," + 
			"				i.maquinaria," + 
			"				i.tecnologia," + 
			"				i.subTipoGS," + 
			"				i.placas," + 
			"				i.tipoRemolque," + 
			"				i.condicion," + 
			"				i.origen," + 
			"				i.transportista			" + 
			"		FROM " + 
			"				Imex_Inventario i," + 
			"				Stock_View s" + 
			" WHERE i.InventarioId = S.InventarioId AND i.isActive = 1;", nativeQuery = true)
	List<Object> findInventories();
	
	/**
	 * Get invenory id.
	 * */
	@Query(value = "SELECT InventarioId FROM Imex_InventariO " +
			" WHERE ContainerId = ?1 " +
			" AND tipoRemolque = ?2 " +
			" AND origen = ?3 " +
			" AND transportista = ?4",  nativeQuery = true)
	Integer findInventoryIdentifier(Integer containerIdentifier,
			String trailerType, String origin, String operator);

	/**
	 * Save inventory.
	 * */
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO Imex_Inventario " + 
			" ( " + 
			"	IdPosicion, " + 
			"	posicion, " + 
			"	idCat_Patios," + 
			"	ocupado," + 
			"	UserId," + 
			"	FechaAsignacion," + 
			"	Guia," + 
			"	ChassisId," + 
			"	ContainerId, " + 
			"	IdReservacion, " + 
			"	ShipperId, " + 
			"	TipoServicioId, " + 
			"	TerminalId, " + 
			"	FechaEscritura, " + 
			"	Booking," + 
			"	TranTypeId, " + 
			"	DateRegistered, " + 
			"	TerminalAnteriorId, " + 
			"	ReservadoTerminal, " + 
			"	sello, " + 
			"	IdTrackingSir," + 
			"	isActive, " + 
			"	anio, " + 
			"	maquinaria, " + 
			"	tecnologia, " + 
			"	subTipoGS, " + 
			"	placas, " + 
			"	tipoRemolque," + 
			"	condicion," + 
			"	origen," + 
			"	transportista" + 
			" ) " + 
			" VALUES( ?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10,?11, ?12, ?13, " +
			" ?14, ?15, ?16, ?17, ?18, ?19, ?20, ?21, ?22,?23, ?24, ?25, ?26, ?27, ?28," +
			" ?29, ?30, ?31)", nativeQuery = true)
	void saveInventory(Integer positionIdentifier,
						String position,
						Integer yardIdentifier,
						Boolean ocuped,
						String userIdentifier,
						Date dateAsignation,
						String guia,
						Integer chassisIdentifier,		
						String containerIdentifier,
						Integer reservationIndentifier,
						BigInteger shipperIdentifier,
						Integer tipoServicioIdentifier,
						Integer terminalIdentifier,
						Date fechaEscritura,
						String booking,
						String tranTypeIdentifier,
						Date dateRegistered,
						String terminalAnteriorIdentifier,
						Boolean reservadoTerminal,
						String sello,
						String IdTrackingSir,
						Boolean isActive,
						String year,
						String machinery,
						String technology,
						String subTipoGS,
						String plaque,
						String tipoRemolque,
						String condition,
						String origin,
						String operator
			);

}
