package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaServer
@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)
	{

		SpringApplication.run(DemoApplication.class, args);
	}

}
