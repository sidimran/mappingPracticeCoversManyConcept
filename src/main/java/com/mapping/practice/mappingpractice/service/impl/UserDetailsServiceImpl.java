package com.mapping.practice.mappingpractice.service.impl;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mapping.practice.mappingpractice.Dto.Resultdto;
import com.mapping.practice.mappingpractice.Dto.UserDetailsDto;
import com.mapping.practice.mappingpractice.converter.UserDetailsConverter;
import com.mapping.practice.mappingpractice.model.UserDetails;
import com.mapping.practice.mappingpractice.repository.userDetailsRepository;
import com.mapping.practice.mappingpractice.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	userDetailsRepository userDetailsRepository;

	@Autowired
	UserDetailsConverter UserDetailsConverter;

	
	@Override
	public Resultdto saveUserDetails(UserDetailsDto userDetailsDto) {

		Resultdto resultdto = new Resultdto();
		UserDetails userDetails = UserDetailsConverter.DtoToEntity(userDetailsDto);
		userDetailsRepository.save(userDetails);
		UserDetailsDto userDto = UserDetailsConverter.entityToDto(userDetails);
		resultdto.setMessage("Stored successfully");
		resultdto.setData(userDto);

		return resultdto;
	}

	@Override
	public Resultdto updateUserDetails(int id, UserDetailsDto userDetailsDto) {

		Resultdto resultdto = new Resultdto();
		Optional<UserDetails> details = userDetailsRepository.findById(id);
		if (details.isEmpty()) {
			resultdto.setMessage("Id Not Found");
		}

		UserDetails userDetailsObj = details.get();

		if (Objects.nonNull(userDetailsDto.getUserName()) && !"".equalsIgnoreCase(userDetailsDto.getUserName())) {
			userDetailsObj.setUserName(userDetailsDto.getUserName());
		}

		userDetailsRepository.save(userDetailsObj);
		UserDetailsDto userDetailsDtoObj = UserDetailsConverter.entityToDto(userDetailsObj);
		resultdto.setMessage("updated");
		resultdto.setData(userDetailsDtoObj);

		return resultdto;
	}

	@Override
	public Resultdto getuserDetailsByid(int id) {

		Resultdto resultdto = new Resultdto();
		Optional<UserDetails> userDetails = userDetailsRepository.findById(id);
		if (userDetails.get().getUseId() != id) {
			resultdto.setMessage("Invalid id");
		}
		UserDetailsDto userDetailsDto = UserDetailsConverter.entityToDto(userDetails.get());
		resultdto.setMessage("fetched data");
		resultdto.setData(userDetailsDto);
		return resultdto;
	}

	@Override
	public Resultdto deleteUserDetailsById(int id) {
		Resultdto resultdto = new Resultdto();
		Optional<UserDetails> userDetailsId = userDetailsRepository.findById(id);
		if (userDetailsId.get().getUseId() != id) {
			resultdto.setMessage("invalid Id");
		}
		userDetailsRepository.deleteById(id);
		resultdto.setMessage("Deleted Successfully");
		return resultdto;
	}

}
