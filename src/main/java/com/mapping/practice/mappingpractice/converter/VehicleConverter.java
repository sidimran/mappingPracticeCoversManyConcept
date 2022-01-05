package com.mapping.practice.mappingpractice.converter;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.mapping.practice.mappingpractice.Dto.VehicleDto;
import com.mapping.practice.mappingpractice.model.Vehicle;

@Component
public class VehicleConverter {

	public VehicleDto entityToDto(Vehicle vehicle) {

		VehicleDto vehicleDto = new VehicleDto();
		vehicleDto.setVehicleId(vehicle.getVehicleId());
		vehicleDto.setVehicleName(vehicle.getVehicleName());
		vehicleDto.setUserDetails(vehicle.getUserDetails());
		return vehicleDto;

	}
	public List<VehicleDto> entityToDto(List<Vehicle> vehicle) {
		return vehicle.stream().map(this::entityToDto).collect(Collectors.toList());
	}

	public Vehicle DtoToEntity(VehicleDto vehicleDto) {
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleId(vehicleDto.getVehicleId());
		vehicle.setVehicleName(vehicleDto.getVehicleName());
		vehicle.setUserDetails(vehicleDto.getUserDetails());
		return vehicle;
	}

	public List<Vehicle> DtoToEntity(List<VehicleDto> vehicleDto) {
		return vehicleDto.stream().map(this::DtoToEntity).collect(Collectors.toList());
	}

}
