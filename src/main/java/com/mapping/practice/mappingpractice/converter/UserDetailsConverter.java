package com.mapping.practice.mappingpractice.converter;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.mapping.practice.mappingpractice.Dto.UserDetailsDto;
import com.mapping.practice.mappingpractice.model.UserDetails;

@Component
public class UserDetailsConverter {

	public UserDetailsDto entityToDto(UserDetails userDetails) {

		UserDetailsDto userDetailsDto = new UserDetailsDto();
		userDetailsDto.setUserId(userDetails.getUseId());
		userDetailsDto.setUserName(userDetails.getUserName());
		userDetailsDto.setVehicle(userDetails.getVehicle());
		userDetailsDto.setAddress(userDetails.getAddress());

		return userDetailsDto;
	}

	public List<UserDetailsDto> entityToDto(List<UserDetails> userDetails) {

		return userDetails.stream().map(this::entityToDto).collect(Collectors.toList());
	}

	public UserDetails DtoToEntity(UserDetailsDto userDetailsDto) {

		UserDetails userDetails = new UserDetails();
		userDetails.setUseId(userDetailsDto.getUserId());
		userDetails.setUserName(userDetailsDto.getUserName());
		userDetails.setVehicle(userDetailsDto.getVehicle());
		userDetails.setAddress(userDetailsDto.getAddress());

		return userDetails;
	}

	public List<UserDetails> DtoToEntity(List<UserDetailsDto> userDetailsDto) {
		return userDetailsDto.stream().map(this::DtoToEntity).collect(Collectors.toList());
	}
}
