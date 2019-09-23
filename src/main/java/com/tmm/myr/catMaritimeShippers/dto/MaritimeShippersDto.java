package com.tmm.myr.catMaritimeShippers.dto;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class MaritimeShippersDto {

	private BigInteger maritimesShippersIndentifier;
	
	private String maritimesShippersDescription;
}
