package com.iitj.migration.sdeMigrationProject.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iitj.migration.sdeMigrationProject.Entity.student;
import com.iitj.migration.sdeMigrationProject.Entity.studentmongo;

@Repository
public interface mstuRepository extends MongoRepository<studentmongo,String> {

	//List<studentmongo> save(List<student> allStudent);

}
