package com.tmm.myr.entrance.IService;

public interface IImexContainerService {

	Integer conteinerExistValidation(String containerName) throws Exception;

	/**
	 * Save container.
	 * */
	Integer saveContainer(String containerName, String containerCode, String itemType) throws Exception;
}
