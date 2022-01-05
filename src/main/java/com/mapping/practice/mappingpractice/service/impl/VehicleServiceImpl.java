package com.mapping.practice.mappingpractice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.practice.mappingpractice.Dto.Resultdto;
import com.mapping.practice.mappingpractice.Dto.VehicleDto;
import com.mapping.practice.mappingpractice.converter.VehicleConverter;
import com.mapping.practice.mappingpractice.model.Vehicle;
import com.mapping.practice.mappingpractice.repository.VehicleRepository;
import com.mapping.practice.mappingpractice.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository vehicleRepository;

	@Autowired
	VehicleConverter vehicleConverter;

	@Override
	public Resultdto saveVehicleData(VehicleDto vehicleDto) {
		Vehicle vehicle = new Vehicle();
		 vehicle = vehicleConverter.DtoToEntity(vehicleDto);
		vehicle =   vehicleRepository.save(vehicle);
		VehicleDto vehiclePassdto = vehicleConverter.entityToDto(vehicle);
		Resultdto resultdto = new Resultdto();
		resultdto.setMessage("save Successfully");
		resultdto.setData(vehiclePassdto);
		return resultdto;
	}

}
