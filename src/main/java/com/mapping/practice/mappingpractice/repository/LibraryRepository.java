package com.mapping.practice.mappingpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.practice.mappingpractice.model.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
