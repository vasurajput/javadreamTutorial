package com.javadream.SpELSpringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpElSpringBootApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(SpElSpringBootApplication.class);

	@Value("#{5+5}")
	private int sum;

	@Value("#{T(java.lang.Math).random() * 100}")
	private double randomValue;

	@Value("#{SpELBean.name}")
	private String nameFromBean;

	@Value("#{SpELBean.name.equals('Vasu Rajput')}")
	private boolean isEqual;

	@Value("#{SpELBean.age >= 18 ? 'valid For Voting' : 'Not Valid For Voting'}")
	private String votingStatus;

	@Value("#{SpELBean.callMe()}")
	private String callBeanMethod;

	@Value("#{environment['spring.application.name']}")
	private String applicationName;

	@Value("#{new String('Hello Javadream. Example of SpEL in Spring Boot')}")
	private String messageObj;

	public static void main(String[] args) {
		SpringApplication.run(SpElSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("sum: {}", sum);
		logger.info("randomValue: {}", randomValue);
		logger.info("nameFromBean: {}", nameFromBean);
		logger.info("isEqual: {}", isEqual);
		logger.info("applicationName: {}", applicationName);
		logger.info("messageObj: {}", messageObj);
		logger.info("votingStatus: {}", votingStatus);
		logger.info("callBeanMethod: {}", callBeanMethod);
	}

}