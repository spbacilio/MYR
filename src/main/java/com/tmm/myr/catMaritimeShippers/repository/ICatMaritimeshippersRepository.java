package com.tmm.myr.catMaritimeShippers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmm.myr.base.entities.CatMaritimeshippers;

@Repository
public interface ICatMaritimeshippersRepository extends JpaRepository<CatMaritimeshippers, Long> {

	/**
	 * Fill combo box.
	 * */
	@Query(value = "SELECT MaritimeShippersId, MaritimeShippersDescription " +
			" FROM cat_maritimeshippers " +
			" WHERE EsActivo = 1", nativeQuery = true)
	List<Object> findPropietary();
}
