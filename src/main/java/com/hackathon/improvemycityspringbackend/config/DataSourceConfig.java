package com.hackathon.improvemycityspringbackend.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.cdimascio.dotenv.Dotenv;

//Steps to configure Spring Boot with dynamic .env values using YAML:

//1. Create a .env file in the project root to store dynamic values (DB credentials, JWT secrets, etc.).
//2. Create an application.yml file under src/main/resources with placeholders for the .env variables.
//3. Add the java-dotenv dependency in pom.xml to enable reading the .env file.
//4. (Optional but recommended) Create a Spring @Configuration class to load values from .env and configure beans (e.g., DataSource).
//5. Run the application; Spring Boot will use the YAML placeholders or the beans from your configuration class.


@Configuration
public class DataSourceConfig {
	 @Bean
	    public DataSource dataSource() {
	        Dotenv dotenv = Dotenv.load();
	        return DataSourceBuilder.create()
	                .url(dotenv.get("DB_URL"))
	                .username(dotenv.get("DB_USERNAME"))
	                .password(dotenv.get("DB_PASSWORD"))
	                .driverClassName("com.mysql.cj.jdbc.Driver")
	                .build();
	    }
}
