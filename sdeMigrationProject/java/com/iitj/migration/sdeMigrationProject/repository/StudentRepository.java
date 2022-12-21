package com.iitj.migration.sdeMigrationProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iitj.migration.sdeMigrationProject.Entity.student;

public interface StudentRepository extends JpaRepository<student,String> {

}
