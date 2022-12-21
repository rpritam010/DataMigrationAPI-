package com.iitj.migration.sdeMigrationProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.iitj.migration.sdeMigrationProject.repository.mstuRepository;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class})
@EnableMongoRepositories(basePackageClasses = mstuRepository.class)
@EnableAutoConfiguration(exclude = EmbeddedMongoAutoConfiguration.class)
public class SdeMigrationProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdeMigrationProjectApplication.class, args);
	}

}
