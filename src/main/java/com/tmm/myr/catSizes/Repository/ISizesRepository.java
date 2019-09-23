package com.tmm.myr.catSizes.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmm.myr.base.entities.ImexCatTamanios;

@Repository
public interface ISizesRepository extends JpaRepository<ImexCatTamanios, Integer> {

	@Query(value= "SELECT TamaniosId,Tamaniosclv  "
			+ " FROM Imex_Cat_Tamanios "
			+ " WHERE TipoEquipoId = ?1 AND ACTIVO = ?2", nativeQuery = true)
	List<Object> findContainerSize(Integer objectType, Integer status);
}
