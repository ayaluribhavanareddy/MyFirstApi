package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.FaangStudents;

@Repository
public interface FaangStudentRepo extends CrudRepository<FaangStudents,Integer>{

	
}
