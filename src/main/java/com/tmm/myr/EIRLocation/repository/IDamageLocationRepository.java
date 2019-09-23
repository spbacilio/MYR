package com.tmm.myr.EIRLocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmm.myr.base.entities.ImexRelLocationsView;

/**
 * This interface provide the CRUD operations to the database.
 *
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 * */
@Repository
public interface IDamageLocationRepository extends JpaRepository<ImexRelLocationsView, String> {

	@Query(value = "SELECT Location, AARCode FROM  Imex_Rel_Locations_View " +
			" WHERE EIRTypeId = 2 AND EIRComponentId = 51", nativeQuery = true)
	List<Object> findAllDamageRelationsByComponent(Integer eirTypeIdentifier, Integer componentIdentifier);
}
