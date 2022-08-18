package com.cts.registrationApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cts.registrationApp.entities.User;

@Repository
public interface RegistrationRepository extends MongoRepository<User, String> {

}
