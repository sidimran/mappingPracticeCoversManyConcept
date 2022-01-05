package com.mapping.practice.mappingpractice.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.mapping.practice.mappingpractice.Dto.ProxyObjectLazyEagerAnnotationDto;
import com.mapping.practice.mappingpractice.model.ProxyObjectLazyEagerAnnotation;

@Component
public class ProxyObjectLazyEagerAnnotationConverter {

	public ProxyObjectLazyEagerAnnotation dtoToEntity(
			ProxyObjectLazyEagerAnnotationDto proxyObjectLazyEagerAnnotationDto) {

		ProxyObjectLazyEagerAnnotation proxyObjectLazyEagerAnnotation = new ProxyObjectLazyEagerAnnotation();
		proxyObjectLazyEagerAnnotation.setId(proxyObjectLazyEagerAnnotationDto.getId());
		proxyObjectLazyEagerAnnotation.setUserName(proxyObjectLazyEagerAnnotationDto.getUserName());
		return proxyObjectLazyEagerAnnotation;
	}
	public List<ProxyObjectLazyEagerAnnotation> dtoToEntity(
			List<ProxyObjectLazyEagerAnnotationDto> proxyObjectLazyEagerAnnotationDto) {
		return proxyObjectLazyEagerAnnotationDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}

	public ProxyObjectLazyEagerAnnotationDto entityToDto(
			ProxyObjectLazyEagerAnnotation proxyObjectLazyEagerAnnotation) {
		ProxyObjectLazyEagerAnnotationDto proxyObjectLazyEagerAnnotationDto = new ProxyObjectLazyEagerAnnotationDto();
		proxyObjectLazyEagerAnnotationDto.setId(proxyObjectLazyEagerAnnotation.getId());
		proxyObjectLazyEagerAnnotationDto.setUserName(proxyObjectLazyEagerAnnotation.getUserName());
		return proxyObjectLazyEagerAnnotationDto;
	}

	public List<ProxyObjectLazyEagerAnnotationDto> entityToDto(
			List<ProxyObjectLazyEagerAnnotation> proxyObjectLazyEagerAnnotation) {
		return proxyObjectLazyEagerAnnotation.stream().map(this::entityToDto).collect(Collectors.toList());
	}

}
