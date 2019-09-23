package com.tmm.myr.reasonDamage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmm.myr.base.entities.ImexReasonDamage;

/**
 * This interface provide the CRUD operations to the database.
 *
 * @author Samuel Pérez
 * @version 1.0 date creation 20/09/2019 10:55:38 PM
 * @since JDK 1.8
 * */
@Repository
public interface IReasonDamageRepository extends JpaRepository<ImexReasonDamage, Integer> {

	/**
	 * Find all reason damage.
	 * 
	 * @return List of generic objects.
	 * */
	@Query(value = "SELECT ReasonDamageId, Reason FROM  Imex_Reason_Damage", nativeQuery = true)
	List<Object> findAllReasonDamage();
}
