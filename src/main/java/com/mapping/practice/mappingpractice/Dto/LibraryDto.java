package com.mapping.practice.mappingpractice.Dto;

import java.util.List;

import com.mapping.practice.mappingpractice.model.Student;

import lombok.Data;

@Data
public class LibraryDto {

	private int libraryId;
	private String libraryName;

	private List<Student> student;

}
