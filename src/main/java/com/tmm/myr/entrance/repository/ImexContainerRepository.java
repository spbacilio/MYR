package com.tmm.myr.entrance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tmm.myr.base.entities.ImexContainer;

@Repository
public interface ImexContainerRepository extends JpaRepository<ImexContainer, Integer> {

	/**
	 * Validate the container selected in Imex_Container table.
	 * 
	 * @param containerName Name of container selected.
	 * @return Container object.
	 * */
	@Query(value = "SELECT ContainerId, Container FROM Imex_Container WHERE Container = ?1", nativeQuery = true)
	Object findContainerById(String containerName);
	
	/**
	 * Save a new container.
	 * */
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO Imex_Container (Container) VALUES (?1)", nativeQuery = true)
	void saveContainer(String containerName);
}
