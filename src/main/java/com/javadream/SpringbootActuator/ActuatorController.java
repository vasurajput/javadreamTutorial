package com.javadream.SpringbootActuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {

	@GetMapping("/javadream")
	public String test() {
		return "Javadream Actuator Example";
	}
}
