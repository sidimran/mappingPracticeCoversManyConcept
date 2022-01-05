package com.mapping.practice.mappingpractice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProxyObjectLazyEagerAnnotation {

	@Id
	@GeneratedValue
	private int id;
	private String userName;
}
