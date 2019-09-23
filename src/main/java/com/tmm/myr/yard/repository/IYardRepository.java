package com.tmm.myr.yard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tmm.myr.base.entities.ImexCatpatios;
import com.tmm.myr.base.exception.MyrException;

/**
 * The objective of the IYardRepository class is ...
 * 
 * @author Samuel Pérez
 * @version 1.0
 * @since JDK 1.8
 * 
 * */
@Repository
public interface IYardRepository extends JpaRepository<ImexCatpatios, Integer> {

	/**
	 * Load all records.
	 * 
	 * @return List of yards.
	 * @throws MyrException MyrException
	 * */
	@Query(value = "SELECT " + 
			"	idCat_Patios, " + 
			"	NombrePatio," + 
			"	estatus" + 
			" FROM Imex_Cat_patios" + 
			" WHERE isActive = 1", nativeQuery = true)
	List<Object> finAllYards();

	/**
	 * Fill the yard combo box.
	 * 
	 * @return Map of yard with status active.
	 * @throws MyrException MyrException
	 * */
	@Query(value = "SELECT idCat_Patios,NombrePatio FROM Imex_Cat_patios WHERE isActive = 1", nativeQuery = true)
	List<Object> findYardName();

	/**
	 * Get yard id.
	 * 
	 * @return id.
	 * */
//	@Query(value = "SELECT MAX(idCat_Patios) FROM Imex_Cat_patios", nativeQuery = true)
//	Long findId();

	/**
	 * Insert a new yar in Imex_Cat_patios table.
	 * @param id_Cat_TipoPatio Field unused.
	 * @param NombrePatio Name of yard.
	 * @param IdDeposito Field unused.
	 * @param estatus Field unused.
	 * @param idcat_servicio Field unused.
	 * @param isActive Active.
	 * */
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO Imex_Cat_patios " + 
			"           (id_Cat_TipoPatio " + 
			"           ,NombrePatio " + 
			"           ,IdDeposito " + 
			"           ,estatus " + 
			"           ,idcat_servicio " + 
			"           ,isActive) " + 
			"     VALUES " + 
			"           (?1 " + 
			"           ,?2 " + 
			"           ,?3" + 
			"           ,?4 " + 
			"           ,?5 " + 
			"           ,?6) ", nativeQuery = true)
	void saveYard(
			int typeId,
			String name,
			int depositId,
			String status,
			int serviceCatId,
			int active);

	/**
	 * Validate records repeated.
	 * @param name Name or yard.
	 * @return Records total;
	 * */
	@Query(value = "SELECT COUNT(idCat_Patios) FROM Imex_Cat_patios WHERE NombrePatio =?1 ", nativeQuery = true)
	Integer countRecords(String name);

	/**
	 * Delete a record according by id selected.
	 * @param identifier The id selected by user.
	 * */
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM Imex_Cat_patios WHERE idCat_Patios =?1", nativeQuery = true)
	void deleteYard(Integer identifier);

	/**
	 * 
	 * */
	@Query(value = "SELECT " + 
			"				p.NombrePatio, " + 
			"				r.patioId " + 
			"			 FROM  " + 
			"			 Imex_Cat_patios p, " + 
			"				Rel_Patios r " + 
			"			 WHERE " + 
			"			 p.isActive = 1 " + 
			"			 AND" + 
			"			 p.idCat_Patios = r.patioId AND r.terminalId = ?1", nativeQuery = true)
	List<Object> findYardRelations(Integer terminalId);

	/**
	 * Save yards relations with terminals.
	 * 
	 * */
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO Rel_Patios  (terminalId, patioId, isActive) VALUES(?1, ?2, ?3)", nativeQuery = true)
	void saveYardRelations(
			Integer terminalId,
			Integer yardId,
			Integer active);
	/**
	 * Delete Relation Yard - Terminal.
	 * */
	@Modifying
	@Transactional
	@Query(value = "DELETE Rel_Patios WHERE terminalId = ?1 AND patioId =?2", nativeQuery = true)
	void deleteYardRelation(Integer terminalId, Integer patioId);

	/**
	 * validate relation existence.
	 * */
	@Query(value = "SELECT terminalId FROM Rel_Patios WHERE terminalId = ?1 and patioId = ?2 and isActive = 1", nativeQuery = true)
	Integer findYarRelationById(Integer terminalId, Integer patioId);
}
