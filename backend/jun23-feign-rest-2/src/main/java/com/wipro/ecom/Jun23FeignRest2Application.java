package com.wipro.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableSwagger2
@EnableFeignClients
public class Jun23FeignRest2Application {

	public static void main(String[] args) {
		SpringApplication.run(Jun23FeignRest2Application.class, args);
	}

}
