package com.mapping.practice.mappingpractice.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.mapping.practice.mappingpractice.Dto.StudentDto;
import com.mapping.practice.mappingpractice.model.Student;

@Component
public class StudentConverter {

	public StudentDto entityToDto(Student student) {

		StudentDto studentDto = new StudentDto();
		studentDto.setStudentId(student.getStudentId());
		studentDto.setFirstName(student.getFirstName());
		studentDto.setLibrary(student.getLibrary());

		return studentDto;
	}

	public List<StudentDto> entityToDto(List<Student> student) {
		return student.stream().map(this::entityToDto).collect(Collectors.toList());
	}

	public Student dtoToEntity(StudentDto studentDto) {

		Student student = new Student();
		student.setStudentId(studentDto.getStudentId());
		student.setFirstName(studentDto.getFirstName());
		student.setLibrary(studentDto.getLibrary());
		return student;
	}

	public List<Student> dtoToEntity(List<StudentDto> studentDto) {
		return studentDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}

}
