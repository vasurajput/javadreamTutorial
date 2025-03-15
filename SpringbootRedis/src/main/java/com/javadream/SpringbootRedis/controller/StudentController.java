package com.javadream.SpringbootRedis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javadream.SpringbootRedis.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;

	@GetMapping("/{rollNo}")
	public String getStudentName(@PathVariable int rollNo) {
		return studentService.getStudentByRollNo(rollNo);
	}

	@PutMapping("/{rollNo}")
	public String updateStudentName(@PathVariable int rollNo, @RequestBody String studentName) {
		return studentService.updateStudentName(rollNo, studentName);
	}

	@DeleteMapping("/{rollNo}")
	public void deleteUser(@PathVariable int rollNo) {
		studentService.deleteStudent(rollNo);
	}
	
	@DeleteMapping("/clearCache")
	public void deleteUser() {
		studentService.clearCache();
	}

}
