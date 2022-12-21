package com.iitj.migration.sdeMigrationProject.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iitj.migration.sdeMigrationProject.Entity.student;

@Repository

public interface DeleteStudentRecord extends CrudRepository<student,String> {

	
}
