package com.volkangurbuz.services.CourseAppClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CourseAppClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseAppClientApplication.class, args);
	}

}
