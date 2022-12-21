package com.iitj.migration.sdeMigrationProject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iitj.migration.sdeMigrationProject.Entity.student;
import com.iitj.migration.sdeMigrationProject.service.studentDetails;


@RestController
@RequestMapping(value="/api")
public class studentController {
	
	private List<student> allStudent;// = new ArrayList<student>();
	
	@Autowired
	private studentDetails studentDetails;

	@GetMapping("/home")
	public String home() {
		return "You are in homePage";
	}
	
	@GetMapping("/getStudent")
	public List<student> getStudent(){
		allStudent = this.studentDetails.getStudent();
		return allStudent;
	}
	@RequestMapping(value = "/deleteStudent", produces = "application/json", method=RequestMethod.GET)
	//@DeleteMapping("/deleteStudent")
	public ResponseEntity<HttpStatus> deleteStudent(){
		try {
			this.studentDetails.deleteStudent();
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@RequestMapping(value = "/student", produces = "application/json", method=RequestMethod.POST)
	//@PostMapping("/student")
	public List<student> addStudent(@RequestBody List<student> student) {
		return this.studentDetails.addStudent(student);
		
	}
	
//Mongo conf  start	
	@GetMapping("/getStudentMongo")
	public List<student> getStudentMongo(){
		allStudent = this.studentDetails.getStudentMongo();
		return allStudent;
	}
	@RequestMapping(value = "/deleteStudentMongo", produces = "application/json", method=RequestMethod.GET)
	//@DeleteMapping("/deleteStudent")
	public ResponseEntity<HttpStatus> deleteStudentMongo(){
		try {
			this.studentDetails.deleteStudentMongo();
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@RequestMapping(value = "/studentMongo", produces = "application/json", method=RequestMethod.POST)
	//@PostMapping("/student")
	public List<student> addStudentMongo(@RequestBody List<student> student) {
		
		return this.studentDetails.addStudentMongo(student);
		
	}
	
	
	//Logic to transfer data from sql to mongodb
	@GetMapping("/Transfersql-mongodb")
	public List<student> addSqltoMongo() {
		allStudent = studentDetails.getStudent();
			studentDetails.deleteStudent();
	
		return this.studentDetails.addStudentMongo(allStudent);
		
	}
	
	@GetMapping("/Transfermongo-sqldb")
	public List<student> addMongotoSql() {
		allStudent = studentDetails.getStudentMongo();
			studentDetails.deleteStudentMongo();	
		return studentDetails.addStudent(allStudent);
		
	}
	
	
}
