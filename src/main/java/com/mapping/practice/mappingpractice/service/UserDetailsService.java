package com.mapping.practice.mappingpractice.service;

import com.mapping.practice.mappingpractice.Dto.Resultdto;
import com.mapping.practice.mappingpractice.Dto.UserDetailsDto;

public interface UserDetailsService {

	public Resultdto saveUserDetails(UserDetailsDto userDetailsDto);

	public Resultdto updateUserDetails(int id, UserDetailsDto userDetailsDto);

	public Resultdto getuserDetailsByid(int id);

	public Resultdto deleteUserDetailsById(int id);

}
