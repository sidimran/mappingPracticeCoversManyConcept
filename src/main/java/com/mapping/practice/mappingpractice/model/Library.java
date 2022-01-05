package com.mapping.practice.mappingpractice.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Library {

	@Id
	@GeneratedValue
	
	@Column(name="library_Id")
	private int libraryId;
	private String libraryName;

	@ManyToMany(mappedBy = "library")
	private List<Student> student;
}
