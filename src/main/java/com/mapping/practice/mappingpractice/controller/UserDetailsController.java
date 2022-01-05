package com.mapping.practice.mappingpractice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mapping.practice.mappingpractice.Dto.Resultdto;
import com.mapping.practice.mappingpractice.Dto.UserDetailsDto;
import com.mapping.practice.mappingpractice.service.UserDetailsService;

@RestController
public class UserDetailsController {

	@Autowired
	UserDetailsService userDetailsService;

	@RequestMapping(value = "/saveUserData", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Resultdto saveUserDetails(@Valid @RequestBody UserDetailsDto userDetailsDto) {
		return userDetailsService.saveUserDetails(userDetailsDto);
	}

	@RequestMapping(value = "/updateUserData/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Resultdto updateUserDetails(@PathVariable(value = "id") int id,
			@Valid @RequestBody UserDetailsDto userDetailsDto) {
		return userDetailsService.updateUserDetails(id, userDetailsDto);
	}

	@RequestMapping(value = "/getByUserId/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Resultdto getDataById(@PathVariable(value = "id") int id) {
		return userDetailsService.getuserDetailsByid(id);
	}

	@RequestMapping(value="/deleteByUserId/{id}", method = RequestMethod.DELETE)
	public Resultdto deleteById(@PathVariable(value = "id") int id) {
		return userDetailsService.deleteUserDetailsById(id);
	}
}
