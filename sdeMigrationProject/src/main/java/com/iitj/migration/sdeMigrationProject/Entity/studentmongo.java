package com.iitj.migration.sdeMigrationProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "student")
public class studentmongo {
	@Id
	public String id;
	
	public String name;
	
	public String course;
	
	public String mobileNumber;
	
	public String address;
	
	public String email;
	
	

	


	public studentmongo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public studentmongo(String id, String name, String course, String mobileNumber, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.email = email;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", course=" + course + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + ", email=" + email + "]";
	}
	
	

}
