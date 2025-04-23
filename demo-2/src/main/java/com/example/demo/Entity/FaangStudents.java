package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table()
public class FaangStudents {
	@Id
	@Column
Integer stuNo;
	@Column
 String stuName;
	@Column
 Integer stuAge;


public FaangStudents(Integer stuNo, String stuName, Integer stuAge) {
	
	this.stuNo = stuNo;
	this.stuName = stuName;
	this.stuAge = stuAge;
}
public FaangStudents() {
	
}
public Integer getStuNo() {
	return stuNo;
}
public void setStuNo(Integer stuNo) {
	this.stuNo = stuNo;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public Integer getStuAge() {
	return stuAge;
}
public void setStuAge(Integer stuAge) {
	this.stuAge = stuAge;
}

}
