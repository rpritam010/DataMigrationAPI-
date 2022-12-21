package com.iitj.migration.sdeMigrationProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iitj.migration.sdeMigrationProject.Entity.student;
@Repository
public interface StudentRepository extends JpaRepository<student,String> {

}
