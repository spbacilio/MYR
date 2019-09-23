package com.tmm.myr.EIRComponents.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmm.myr.base.entities.ImexEirComponents;

/**
 * This interface provide the CRUD operations to the database.
 *
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 * */
@Repository
public interface IEIRComponentRepository extends JpaRepository <ImexEirComponents, Integer> {

	/**
	 * Get component description from Imex_Eir_Components table.
	 * 
	 * @param eirTypeId Id of section component.
	 * @return List of generic objects.
	 * 
	 * */
	@Query(value = "SELECT "
			+ " EIRComponentId, "
			+ " Component, "
			+ " AARCode "
			+ " FROM Imex_Eir_Components "
			+ " WHERE  IsActive = 1 AND EIRTypeId = ?1", nativeQuery = true)
	List<Object> findEirComponent(Integer eirTypeId);
}
