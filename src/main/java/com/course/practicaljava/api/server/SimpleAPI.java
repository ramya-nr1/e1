package com.course.practicaljava.api.server;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.*;

@RestController
@RequestMapping(value="/simpleAPI")
public class SimpleAPI {
	

	private Logger LOG = LoggerFactory.getLogger(SimpleAPI.class);
	
	@RequestMapping(value = "/welcomeMessage")
	public void welcomeMessage() {
		LOG.info("Info from Log");
		System.out.println("Welcome to Spring Boot");
	}
	
	@RequestMapping(value = "/time")
	public String time() {
		return LocalTime.now().toString();
	}
	
	
}
