package com.tmm.myr.EIRGPositions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmm.myr.base.entities.ImexEirGeneralPositions;

/**
 * This interface provide the CRUD operations to the database.
 *
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 * */
@Repository
public interface IEirGeneralPositionsRepository extends JpaRepository<ImexEirGeneralPositions, Integer> {

	/**
	 * Find general positions from Imex_Eir_General_Positions table.
	 * 
	 * @return List of sections.
	 * */
	@Query(value = "SELECT EIRGeneralPositionId, Position, EIRTypeId FROM Imex_Eir_General_Positions WHERE IsActive = 1", nativeQuery = true)
	List<Object> findGeneralPositions();
	
}
