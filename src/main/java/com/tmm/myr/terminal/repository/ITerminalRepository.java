package com.tmm.myr.terminal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tmm.myr.base.entities.ImexTerminal;

@Repository
public interface ITerminalRepository extends JpaRepository<ImexTerminal, Integer> {

	/**
	 * Get yard id.
	 * 
	 * @return id.
	 * */
	@Query(value = "SELECT MAX(TerminalId) FROM Imex_Terminal", nativeQuery = true)
	Long findId();
	
	/**
	 * Combo
	 * */
	@Query(value = "SELECT TerminalId, Descripcion, Codigo FROM Imex_Terminal WHERE Activo = 1", nativeQuery = true)
	List<Object> findTerminals();
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO Imex_Terminal (TerminalId, Descripcion, Codigo, Activo) VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
	void saveTerminal(Integer identifier, String name, String code, Integer active);
	
	/**
	 * Delete a record according by id selected.
	 * @param identifier The id selected by user.
	 * */
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM Imex_Terminal WHERE TerminalId =?1", nativeQuery = true)
	void deleteTerminal(Integer identifier);
}
