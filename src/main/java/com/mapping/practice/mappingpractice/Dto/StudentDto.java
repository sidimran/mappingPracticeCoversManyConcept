package com.mapping.practice.mappingpractice.Dto;

import java.util.List;

import com.mapping.practice.mappingpractice.model.Library;

import lombok.Data;

@Data
public class StudentDto {

	private int studentId;

	private String firstName;

	private List<Library> library;

}
