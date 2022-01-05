package com.mapping.practice.mappingpractice.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class AddressDto {

	private String street;
	private String city;
	private String state;
	private int pinCode;

}
