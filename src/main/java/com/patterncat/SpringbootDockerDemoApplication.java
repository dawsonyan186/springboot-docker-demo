package com.patterncat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerDemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootDockerDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerDemoApplication.class, args);
	}

	@RequestMapping("/")
	public String index(){
		logger.info("request /");
		return "this is index";
	}
}
