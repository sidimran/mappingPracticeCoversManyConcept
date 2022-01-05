package com.mapping.practice.mappingpractice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.practice.mappingpractice.Dto.EmbeddableUserDto;
import com.mapping.practice.mappingpractice.Dto.Resultdto;
import com.mapping.practice.mappingpractice.service.EmbeddableUserService;

@RestController
public class EmbeddableUserController {

	@Autowired
	EmbeddableUserService embeddableUserService;

	@RequestMapping(value="/saveEmbeddableUserData", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Resultdto saveEmbeddableuserData(@Valid @RequestBody EmbeddableUserDto embeddableUserDto) {
		return embeddableUserService.saveEmbeddedUserData(embeddableUserDto);

	}
}
