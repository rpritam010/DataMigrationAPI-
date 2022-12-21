package com.iitj.migration.sdeMigrationProject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iitj.migration.sdeMigrationProject.Entity.student;

@Repository
public interface mstuRepository extends MongoRepository<student,String> {

}
