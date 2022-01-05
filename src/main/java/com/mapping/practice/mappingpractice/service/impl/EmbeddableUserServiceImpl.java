package com.mapping.practice.mappingpractice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.practice.mappingpractice.Dto.EmbeddableUserDto;
import com.mapping.practice.mappingpractice.Dto.Resultdto;
import com.mapping.practice.mappingpractice.converter.EmbeddableUserConverter;
import com.mapping.practice.mappingpractice.model.EmbeddableUser;
import com.mapping.practice.mappingpractice.repository.EmbeddableUserRepository;
import com.mapping.practice.mappingpractice.service.EmbeddableUserService;

@Service
public class EmbeddableUserServiceImpl implements EmbeddableUserService {

	@Autowired
	EmbeddableUserRepository embeddableUserRepository;

	@Autowired
	EmbeddableUserConverter embeddableUserConverter;

	@Override
	public Resultdto saveEmbeddedUserData(EmbeddableUserDto embeddableUserDto) {

		Resultdto resultdto = new Resultdto();
		EmbeddableUser embeddableUser = embeddableUserConverter.dtoToEntity(embeddableUserDto);
		embeddableUser = embeddableUserRepository.save(embeddableUser);
		EmbeddableUserDto passEmbeddableUserDto = embeddableUserConverter.entityToDto(embeddableUser);
		resultdto.setMessage("Save Successfully");
		resultdto.setData(passEmbeddableUserDto);
		return resultdto;
	}

}
