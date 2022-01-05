package com.mapping.practice.mappingpractice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.practice.mappingpractice.Dto.LibraryDto;
import com.mapping.practice.mappingpractice.Dto.Resultdto;
import com.mapping.practice.mappingpractice.converter.LibraryConverter;
import com.mapping.practice.mappingpractice.model.Library;
import com.mapping.practice.mappingpractice.repository.LibraryRepository;
import com.mapping.practice.mappingpractice.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	LibraryRepository libraryRepository;

	@Autowired
	LibraryConverter libraryConverter;

	@Override
	public Resultdto saveLibrarydata(LibraryDto libraryDto) {

		Resultdto resultdto = new Resultdto();
		Library library = libraryConverter.dtoToEntity(libraryDto);
		library = libraryRepository.save(library);
		LibraryDto passLibraryDto = libraryConverter.entityToDto(library);
		resultdto.setMessage("Data Saved");
		resultdto.setData(passLibraryDto);
		return resultdto;
	}

}
