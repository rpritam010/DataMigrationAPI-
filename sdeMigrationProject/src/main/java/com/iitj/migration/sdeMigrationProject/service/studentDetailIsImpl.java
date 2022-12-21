package com.iitj.migration.sdeMigrationProject.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iitj.migration.sdeMigrationProject.Entity.student;
import com.iitj.migration.sdeMigrationProject.Entity.studentmongo;
import com.iitj.migration.sdeMigrationProject.repository.DeleteStudentRecord;
import com.iitj.migration.sdeMigrationProject.repository.StudentRepository;
import com.iitj.migration.sdeMigrationProject.repository.mstuRepository;

@Service
public class studentDetailIsImpl implements studentDetails {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private DeleteStudentRecord deleteStudentRecord;
	
	@Autowired
	private mstuRepository mdb;
	

	public studentDetailIsImpl() {
		
	}



	@Override
	public List<student> getStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
		
	}



	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		deleteStudentRecord.deleteAll();
		
	}



	@Override
	public List<student> addStudent(List<student> student) {
		// TODO Auto-generated method stub
		return studentRepository.saveAll(student);
	}


//Mongo configuration
	@Override
	public List<studentmongo> getStudentMongo() {
		// TODO Auto-generated method stub
		return mdb.findAll();
	}



	@Override
	public void deleteStudentMongo() {
		// TODO Auto-generated method stub
		mdb.deleteAll();
	}



	@Override
	public List<studentmongo> addStudentMongo(List<studentmongo> allStudent) {
		// TODO Auto-generated method stub
		return mdb.saveAll(allStudent);
	}



//	@Override
//	public List<studentmongo> addStudentMongo(List<studentmongo> student) {
//		// TODO Auto-generated method stub
//		return mdb.saveAll(student);
//	}

}
