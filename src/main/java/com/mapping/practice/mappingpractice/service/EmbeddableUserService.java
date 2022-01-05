package com.mapping.practice.mappingpractice.service;

import com.mapping.practice.mappingpractice.Dto.EmbeddableUserDto;
import com.mapping.practice.mappingpractice.Dto.Resultdto;

public interface EmbeddableUserService {
	
	public Resultdto saveEmbeddedUserData(EmbeddableUserDto embeddableUserDto);

}
