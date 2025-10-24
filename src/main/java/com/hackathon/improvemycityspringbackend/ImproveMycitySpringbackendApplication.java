package com.hackathon.improvemycityspringbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ImproveMycitySpringbackendApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(ImproveMycitySpringbackendApplication.class, args);
		
	}

}
//must run 'mvn clean package' first to create the JAR.
//3️ Run the correct JAR on CMD:
//set SPRING_PROFILES_ACTIVE=dev  or prod
//java -jar target\improve-mycity-spring-backend-0.0.1-SNAPSHOT.jar

//on Powershell:
//$env:SPRING_PROFILES_ACTIVE="dev"
//java -jar target\improve-mycity-spring-backend-0.0.1-SNAPSHOT.jar





