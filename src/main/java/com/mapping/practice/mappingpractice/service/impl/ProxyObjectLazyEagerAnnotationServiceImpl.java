package com.mapping.practice.mappingpractice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.practice.mappingpractice.Dto.ProxyObjectLazyEagerAnnotationDto;
import com.mapping.practice.mappingpractice.Dto.Resultdto;
import com.mapping.practice.mappingpractice.converter.ProxyObjectLazyEagerAnnotationConverter;
import com.mapping.practice.mappingpractice.model.ProxyObjectLazyEagerAnnotation;
import com.mapping.practice.mappingpractice.repository.ProxyObjectLazyEagerAnnotationRepository;
import com.mapping.practice.mappingpractice.service.ProxyObjectLazyEagerAnnotationService;

@Service
public class ProxyObjectLazyEagerAnnotationServiceImpl implements ProxyObjectLazyEagerAnnotationService {

	@Autowired
	ProxyObjectLazyEagerAnnotationRepository proxyObjectLazyEagerAnnotationRepository;

	@Autowired
	ProxyObjectLazyEagerAnnotationConverter proxyObjectLazyEagerAnnotationConverter;

	@Override
	public Resultdto saveProxyObjectLazyEagerAnnotationData(
			ProxyObjectLazyEagerAnnotationDto proxyObjectLazyEagerAnnotationDto) {

		ProxyObjectLazyEagerAnnotation proxyObjectLazyEageannotation = proxyObjectLazyEagerAnnotationConverter
				.dtoToEntity(proxyObjectLazyEagerAnnotationDto);
		proxyObjectLazyEageannotation = proxyObjectLazyEagerAnnotationRepository.save(proxyObjectLazyEageannotation);
		ProxyObjectLazyEagerAnnotationDto passProxyObjectLazyEagerAnnotationDto = proxyObjectLazyEagerAnnotationConverter
				.entityToDto(proxyObjectLazyEageannotation);

		Resultdto resultdto = new Resultdto();
		resultdto.setMessage("Stroed Data");
		resultdto.setData(passProxyObjectLazyEagerAnnotationDto);
		return resultdto;
	}

}
