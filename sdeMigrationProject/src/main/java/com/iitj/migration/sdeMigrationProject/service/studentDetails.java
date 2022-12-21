package com.iitj.migration.sdeMigrationProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iitj.migration.sdeMigrationProject.Entity.student;
import com.iitj.migration.sdeMigrationProject.Entity.studentmongo;
@Service
public interface studentDetails {
	
	public List<student> getStudent();
	
	public void deleteStudent() ;

	public List<student> addStudent(List<student> student);

	public List<studentmongo> getStudentMongo();

	public void deleteStudentMongo();

	//public List<studentmongo> addStudentMongo(List<studentmongo> student);

	public List<studentmongo> addStudentMongo(List<studentmongo> student);
	
	

}
