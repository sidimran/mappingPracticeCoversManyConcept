package com.mapping.practice.mappingpractice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.practice.mappingpractice.Dto.Resultdto;
import com.mapping.practice.mappingpractice.Dto.VehicleDto;
import com.mapping.practice.mappingpractice.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	VehicleService vehicelService;

	@RequestMapping(value = "/saveVehicleData", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Resultdto saveVehicleData(@Valid @RequestBody VehicleDto vehicleDto) {
		return vehicelService.saveVehicleData(vehicleDto);

	}

}
