package com.example.springbootdocker.controller;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {
	
	private static Logger logger = LoggerFactory.getLogger(BootController.class);

	@GetMapping("/hellgate/{name}")
	public String getHome(@PathVariable("name") String name) {
		logger.info("Boot controller {}", name);
		String value = "Hell ".concat(name).concat(" Response ").concat(LocalDateTime.now().toString());
		logger.info("Boot response {}", value);
		return value;
	}

}
