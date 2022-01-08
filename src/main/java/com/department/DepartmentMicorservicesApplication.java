package com.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentMicorservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentMicorservicesApplication.class, args);
	}

}
