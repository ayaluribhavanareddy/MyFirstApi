package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.FaangStudents;
import com.example.demo.repo.FaangStudentRepo;
@Service
public class FaangStudentService {
	
	@Autowired
	FaangStudentRepo repo;
  public void store(FaangStudents f) {
	repo.save(f);
}
 public void storeAll(Iterable <FaangStudents> f){
	 repo.saveAll(f);
 }
 public Optional<FaangStudents> get(Integer stuNo)
 {
	 return repo.findById(stuNo);
 }
 public Iterable <FaangStudents> getall(){
	 return repo.findAll();
 }
 public void update(FaangStudents f) {
	 repo.save(f);
 }
 public void updateall(Iterable<FaangStudents> fuf) {
	 repo.saveAll(fuf);
 }
 public void delete(FaangStudents fuf) {
	 repo.delete(fuf);
 }
 public void deleteAll(Iterable<FaangStudents> fuf) {
	 repo.delete(fuf);
 }
 
}
