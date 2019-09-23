package com.tmm.myr.users.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UserDto {

	public String id;

	public String type;

	public String name;

	public String description;

	public Boolean isShipper;

	public Integer shipperId;

	public Integer area;

	public Integer terminalId;
}
