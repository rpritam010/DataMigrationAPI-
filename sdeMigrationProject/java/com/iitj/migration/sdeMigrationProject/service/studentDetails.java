package com.iitj.migration.sdeMigrationProject.service;

import java.util.List;

import com.iitj.migration.sdeMigrationProject.Entity.student;

public interface studentDetails {
	
	public List<student> getStudent();
	
	public void deleteStudent() ;

	public List<student> addStudent(List<student> student);

	public List<student> getStudentMongo();

	public void deleteStudentMongo();

	public List<student> addStudentMongo(List<student> student);
	
	

}
