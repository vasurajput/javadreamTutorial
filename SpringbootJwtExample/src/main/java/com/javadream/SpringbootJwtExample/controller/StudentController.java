package com.javadream.SpringbootJwtExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/info")
	public String test() {
		return "Hello from Student info API. You are getting the response because you provided the valid JWT token";
	}

}
