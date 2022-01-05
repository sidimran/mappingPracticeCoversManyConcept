package com.mapping.practice.mappingpractice.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class EmbeddableAddress {

	private String street;
	private String city;
	private String state;
	private int pinCode;

}
