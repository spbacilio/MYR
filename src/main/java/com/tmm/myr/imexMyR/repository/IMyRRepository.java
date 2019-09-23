package com.tmm.myr.imexMyR.repository;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tmm.myr.base.entities.ImexMyR;

@Repository
public interface IMyRRepository extends JpaRepository<ImexMyR, Integer> {
	
	/**
	 * STOCK VIEW
	 * */
	@Query(value = "SELECT Container, TerminalId FROM Stock_View WHERE Container = ?1 AND TerminalId = ?2", nativeQuery = true)
	Object findStockView(String name, Integer termianalId);
	
	/**
	 * Obteniendo informacion del ultimo movimiento del contenedor
	 * */
	@Query(value = "SELECT * FROM Container_MYR_View WHERE ContainerId =?1 AND TerminalId = ?2", nativeQuery = true)
	List<Object> findMyRViews(Integer containerId, Integer terminalId); 

	/**
	 * Save MyR.
	 */
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO Imex_MyR " + 
			" ( " + 
			"	CycleCode," + 
			"	ContainerId," + 
			"	ChassisId," + 
			"	TerminalId," + 
			"	DateCompleted," + 
			"	UserImexId," + 
			"	CommentsCont," + 
			"	CommentsChas," + 
			"	DaniosId," + 
			"	ClasificacionId," + 
			"	TamaniosId," + 
			"	DaniosChId," + 
			"	TamaniosChId," + 
			"	ShipperId," + 
			"	TipoEirId," + 
			"	TipoInspeccionId," + 
			"	DriverId," + 
			"	serviceGroupId" + 
			" ) " + 
			"VALUES ( ?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14, ?15, ?16, ?17, ?18)", nativeQuery = true)
	void saveMyR(Integer cycleCode,
			Integer containerId,
			Integer chassisId,
			Integer terminalId,
			Date dateCompleted,
			String userImexId,
			String commentsCont,
			String commentsChas,
			Integer daniosId,
			Integer clasificacionId,
			Integer tamaniosId,
			Integer daniosChId,
			Integer tamaniosChId,
			BigInteger shipperId,
			Integer tipoEirId,
			Integer tipoInspeccionId,
			Integer driverId,
			Integer serviceGroupId);
	
}
