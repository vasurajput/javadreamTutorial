package com.javadream.SpELSpringBoot;

import org.springframework.stereotype.Component;

@Component("SpELBean")
public class SpELBean {

	private String name = "Vasu Rajput";
	private int age = 17;

	//Getter method of variables
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String callMe() {
		return "Java dream SpEL in Spring boot example";
	}

}