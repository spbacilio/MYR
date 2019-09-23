package com.tmm.myr.EIRDamage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.tmm.myr.base.entities.ImexEirDamage;

@Repository
public interface IEIRDamageRepository extends JpaRepository<ImexEirDamage, Integer> {

	/**
	 * Get all EIR damage.
	 * 
	 * 
	 * */
	@Query(value = "SELECT EIRDamageId, Damage, AARCode, EIRTypeId  FROM  Imex_Eir_Damage WHERE IsActive = 1 AND EIRTypeId = ?1 AND AARCode is not null;", nativeQuery = true)
	List<Object> findAllEIRDamage(Integer eirTypeId);
}
