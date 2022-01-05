package com.mapping.practice.mappingpractice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.practice.mappingpractice.Dto.ProxyObjectLazyEagerAnnotationDto;
import com.mapping.practice.mappingpractice.Dto.Resultdto;
import com.mapping.practice.mappingpractice.service.ProxyObjectLazyEagerAnnotationService;

@RestController
public class ProxyObjectLazyEagerAnnotationController {

	@Autowired
	ProxyObjectLazyEagerAnnotationService proxyObjectLazyEagerAnnotationService;

	@RequestMapping(value = "/saveProxyData", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Resultdto saveProxyObjectLazyEagerAnnotationServiceData(
			@Valid @RequestBody ProxyObjectLazyEagerAnnotationDto proxyObjectLazyEagerAnnotationDto) {
		return proxyObjectLazyEagerAnnotationService
				.saveProxyObjectLazyEagerAnnotationData(proxyObjectLazyEagerAnnotationDto);
	}

}
