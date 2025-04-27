package com.javadream.SpringbootDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping("/testDocker")
	public String docker() {
		return "You are learning Spring boot integration with Docker from JavaDream";
	}
}
