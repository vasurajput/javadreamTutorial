package com.javadream.SpringbootRedis.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

	Map<Integer, String> studentMap = new HashMap<>();

	public StudentService() {
		studentMap.put(1, "Vasu");
		studentMap.put(2, "vishu");
		studentMap.put(3, "Raghu");
		studentMap.put(4, "Deepanshu");
		studentMap.put(5, "Koku");
	}

	@Cacheable(value = "students", key = "#rollNumber")
	public String getStudentByRollNo(int rollNumber) {
		logger.info("Fetching student details from studentMap for rollNo: "+ rollNumber);
	    return studentMap.get(rollNumber);
	}

	@CachePut(value = "students", key = "#rollNumber")
	public String updateStudentName(int rollNumber, String studentName) {
		logger.info("Updating user in database...");
		studentMap.put(rollNumber, studentName);
		return studentMap.get(rollNumber);
	}

	@CacheEvict(value = "students", key = "#rollNumber")
	public void deleteStudent(int rollNumber) {
		logger.info("Deleting student from cache...");
		studentMap.remove(rollNumber);
	}
	
	@CacheEvict(value = "students", allEntries = true)
	public void clearCache() {
		logger.info("All Cache Cleared...");
	}

}
