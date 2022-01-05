package com.mapping.practice.mappingpractice.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.mapping.practice.mappingpractice.Dto.EmbeddableUserDto;
import com.mapping.practice.mappingpractice.model.EmbeddableUser;

@Component
public class EmbeddableUserConverter {

	public EmbeddableUser dtoToEntity(EmbeddableUserDto embeddableUserDto) {

		EmbeddableUser embeddableUser = new EmbeddableUser();
		embeddableUser.setUserId(embeddableUserDto.getUserId());
		embeddableUser.setUserName(embeddableUserDto.getUserName());
		embeddableUser.setEmbeddableAddress(embeddableUserDto.getEmbeddableAddress());
		return embeddableUser;

	}

	public List<EmbeddableUser> dtoToEntity(List<EmbeddableUserDto> embeddableUserDto) {
		return embeddableUserDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}

	public EmbeddableUserDto entityToDto(EmbeddableUser embeddableUser) {

		EmbeddableUserDto embeddableUserDto = new EmbeddableUserDto();
		embeddableUserDto.setUserId(embeddableUser.getUserId());
		embeddableUserDto.setUserName(embeddableUser.getUserName());
		//embeddableUserDto.setEmbeddableAddress(embeddableUser.getEmbeddableAddress());
		embeddableUserDto.setEmbeddableAddress(embeddableUser.getEmbeddableAddress());
		
		return embeddableUserDto;

	}

	public List<EmbeddableUserDto> entityToDto(List<EmbeddableUser> embeddableUsers) {
		return embeddableUsers.stream().map(this::entityToDto).collect(Collectors.toList());
	}

}
