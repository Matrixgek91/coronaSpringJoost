package com.example.coronaApp.service;

import com.example.coronaApp.model.Registration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationService extends CrudRepository<Registration, Integer> {

    Iterable<Registration> findByUsernameAndPassword(String username, String password);



}
