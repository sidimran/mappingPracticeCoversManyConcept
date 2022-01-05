package com.mapping.practice.mappingpractice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.practice.mappingpractice.Dto.Resultdto;
import com.mapping.practice.mappingpractice.Dto.StudentDto;
import com.mapping.practice.mappingpractice.converter.StudentConverter;
import com.mapping.practice.mappingpractice.model.Student;
import com.mapping.practice.mappingpractice.repository.StudentRepository;
import com.mapping.practice.mappingpractice.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	StudentConverter studentConverter;

	@Override
	public Resultdto saveStudentData(StudentDto studentDto) {

		Resultdto resultdto = new Resultdto();
		Student student = studentConverter.dtoToEntity(studentDto);
		student = studentRepository.save(student);
		StudentDto passStudentDto = studentConverter.entityToDto(student);
		resultdto.setMessage("Stored Successfully");
		resultdto.setData(passStudentDto);
		return resultdto;
	}

}
