package com.mapping.practice.mappingpractice.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.mapping.practice.mappingpractice.Dto.LibraryDto;
import com.mapping.practice.mappingpractice.model.Library;

@Component
public class LibraryConverter {

	public Library dtoToEntity(LibraryDto libraryDto) {

		Library library = new Library();
		library.setLibraryId(libraryDto.getLibraryId());
		library.setLibraryName(libraryDto.getLibraryName());
		library.setStudent(libraryDto.getStudent());

		return library;
	}

	public List<Library> dtoToEntity(List<LibraryDto> libraryDto) {

		return libraryDto.stream().map(this::dtoToEntity).collect(Collectors.toList());

	}

	public LibraryDto entityToDto(Library library) {

		LibraryDto libraryDto = new LibraryDto();
		libraryDto.setLibraryId(library.getLibraryId());
		libraryDto.setLibraryName(library.getLibraryName());
		libraryDto.setStudent(library.getStudent());
		return libraryDto;

	}

	public List<LibraryDto> entityToDto(List<Library> library) {
		return library.stream().map(this::entityToDto).collect(Collectors.toList());
	}

}
