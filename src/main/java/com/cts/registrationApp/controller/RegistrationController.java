package com.cts.registrationApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.registrationApp.entities.User;
import com.cts.registrationApp.service.RegistrationService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class RegistrationController {

	//nnn
	@Autowired
	RegistrationService registrationService;
	
	@PostMapping("/register")
	public String createUser(@RequestBody User user) {
		return registrationService.saveUser(user);
	}
}
