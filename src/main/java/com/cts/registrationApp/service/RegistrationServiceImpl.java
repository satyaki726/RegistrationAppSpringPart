package com.cts.registrationApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.registrationApp.entities.User;
import com.cts.registrationApp.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationRepository registrationRepository;
	
	@Override
	public String saveUser(User user) {
		User save = registrationRepository.save(user);
		if(save.getName() == user.getName())
			return "User is saved";
		else
			return "User is not correctly saved";
	}

}
