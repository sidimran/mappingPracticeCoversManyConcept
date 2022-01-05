package com.mapping.practice.mappingpractice.Dto;

import com.mapping.practice.mappingpractice.model.UserDetails;

import lombok.Data;

@Data
public class VehicleDto {

	private int vehicleId;
	private String vehicleName;
	private UserDetails userDetails;

}
