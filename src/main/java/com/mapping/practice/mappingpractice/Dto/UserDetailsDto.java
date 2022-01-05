package com.mapping.practice.mappingpractice.Dto;

import java.util.List;
import com.mapping.practice.mappingpractice.model.Address;
import com.mapping.practice.mappingpractice.model.Vehicle;
import lombok.Data;

@Data
public class UserDetailsDto {

	private int userId;
	private String userName;

	private List<Vehicle> vehicle;

	private Address address;

}
