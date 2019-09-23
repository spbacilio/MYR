package com.tmm.myr.catSizes.Service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmm.myr.base.bussiness.Equipment;
import com.tmm.myr.base.constants.Status;
import com.tmm.myr.base.utils.MapFormatter;
import com.tmm.myr.catSizes.IService.ICatSizesService;
import com.tmm.myr.catSizes.Repository.ISizesRepository;

@Service
public class CatSizesService implements ICatSizesService {
	
	@Autowired
	private ISizesRepository sizesRepository;

	@Override
	public Map<Integer, String> fillComboBoxControl() throws Exception {
		return MapFormatter.objectToMapInt(sizesRepository.findContainerSize(Equipment.CONTAINER_VALUE, Status.ACTIVE));
	}

}
