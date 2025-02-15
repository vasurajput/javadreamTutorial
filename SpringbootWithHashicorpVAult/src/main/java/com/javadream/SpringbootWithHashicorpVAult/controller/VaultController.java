package com.javadream.SpringbootWithHashicorpVAult.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaultController {
	
    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;


	@GetMapping("/fetchFromVault")
	public String fetchVaultSecret() {
		return "Data fetched from vault userName is: " + username + " & password is: "+ password;
	}
}
