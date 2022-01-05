package com.mapping.practice.mappingpractice.Dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.mapping.practice.mappingpractice.model.EmbeddableAddress;

import lombok.Data;

@Data
public class EmbeddableUserDto {

	private int userId;
	private String userName;

	//private Set<EmbeddableAddress> embeddableAddress = new HashSet<>();

	private Collection<EmbeddableAddress> embeddableAddress = new ArrayList();

}
