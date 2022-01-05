package com.mapping.practice.mappingpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.practice.mappingpractice.model.UserDetails;

@Repository
public interface userDetailsRepository extends JpaRepository<UserDetails, Integer> {

}
