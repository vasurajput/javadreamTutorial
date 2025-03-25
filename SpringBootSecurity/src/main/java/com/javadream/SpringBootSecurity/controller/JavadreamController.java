package com.javadream.SpringBootSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavadreamController {

	
	@GetMapping("/dummy")
	public String dummy() {
		return "You are learning Spring boot security from Javadream";
	}
}
