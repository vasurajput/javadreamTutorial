package com.javadream.MappedSuperClassJPAExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MappedSuperClassJpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappedSuperClassJpaExampleApplication.class, args);
	}

}
