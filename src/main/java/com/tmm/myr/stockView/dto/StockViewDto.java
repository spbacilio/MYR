package com.tmm.myr.stockView.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class StockViewDto {

	private String containerName;
	
	private Integer terminalIdentifier;
}
