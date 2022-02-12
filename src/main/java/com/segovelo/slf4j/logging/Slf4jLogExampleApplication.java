package com.segovelo.slf4j.logging;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Slf4jLogExampleApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Slf4jLogExampleApplication.class, args);
        SpringApplication app = new SpringApplication(Slf4jLogExampleApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8083"));
        app.run(args);

	}

}
