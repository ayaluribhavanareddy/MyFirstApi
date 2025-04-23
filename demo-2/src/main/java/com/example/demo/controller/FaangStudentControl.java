package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.FaangStudents;
import com.example.demo.service.FaangStudentService;

@RestController
public class FaangStudentControl {
@Autowired
FaangStudentService service;
@PostMapping(value="/insertfaangstudents")
public String insertfaangstudents(@RequestBody FaangStudents student) {
	service.store(student);
	return "detailes inserted--->"+student.getStuNo();
}
@PostMapping(value="/insertmorefaangstudents")
public String insertmorefaangstudents(@RequestBody Iterable<FaangStudents> stu) {
	service.storeAll(stu);
	return "all-inserted";
}
@GetMapping("/{stuNo}")
public Optional<FaangStudents>getfaangstudents(@PathVariable Integer stuNo){
	return service.get(stuNo);
	
}
@GetMapping("/getall")
public Iterable<FaangStudents>getFaangstudents(){
	return service.getall();
}
@PutMapping(value="/updated")
public String updated(@RequestBody FaangStudents fuf) {
	 service.update(fuf);
	 return "updated succesfully";
}
@PutMapping(value="/updatedAll")
public String updatedAll(@RequestBody Iterable<FaangStudents> stud ) {
	service.updateall(stud);
	return "updatedAll";
}
@DeleteMapping("/{no}")
public void deletefaangstudents(@PathVariable FaangStudents no){
	service.delete(no);
}
@DeleteMapping(value = "/deleteAll")
public String deleteAll(@RequestBody Iterable<FaangStudents> fuf) {
    service.deleteAll(fuf);
    return "All deleted";
}


}
