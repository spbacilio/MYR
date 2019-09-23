package com.tmm.myr.stockView.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmm.myr.imexMyR.repository.IMyRRepository;
import com.tmm.myr.stockView.IService.IStockViewService;
import com.tmm.myr.stockView.converter.StockViewConverter;
import com.tmm.myr.stockView.dto.StockViewDto;

@Service
public class StockViewService implements IStockViewService{
	
	@Autowired
	private IMyRRepository MyRRepository;
	
	@Resource
	private StockViewConverter converter;

	@Override
	public StockViewDto getInventoryView(String containerName, Integer terminalIdentifier) throws Exception {
		return converter.converter(MyRRepository.findStockView(containerName, terminalIdentifier));
	}

}
