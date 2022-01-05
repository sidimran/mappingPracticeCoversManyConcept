package com.mapping.practice.mappingpractice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.practice.mappingpractice.Dto.LibraryDto;
import com.mapping.practice.mappingpractice.Dto.Resultdto;
import com.mapping.practice.mappingpractice.service.LibraryService;

@RestController
public class LibraryController {

	@Autowired
	LibraryService libraryService;

	@RequestMapping(value = "/saveLibrarydata", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Resultdto saveLibraryData(@Valid @RequestBody LibraryDto libraryDto) {
		return libraryService.saveLibrarydata(libraryDto);

	}

}
