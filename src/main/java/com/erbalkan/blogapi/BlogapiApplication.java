package com.erbalkan.blogapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BlogapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogapiApplication.class, args);
	}

}
