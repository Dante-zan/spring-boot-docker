package com.example.springbootdocker.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

	@GetMapping("/hellgate/{name}")
	public String getHome(@PathVariable("name") String name) {
		String value = "Hell ".concat(name).concat(" Response ").concat(LocalDateTime.now().toString());
		System.out.println(value);
		return value;
	}

}
