package com.tmm.myr.stockView.IService;

import com.tmm.myr.stockView.dto.StockViewDto;

public interface IStockViewService {

	StockViewDto getInventoryView(String containerName, Integer terminalIdentifier) throws Exception;
}
