package com.example.coronaApp.controller;


import com.example.coronaApp.model.Login;
import com.example.coronaApp.model.Registration;
import com.example.coronaApp.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {

    @Autowired private RegistrationService registrationService;

    @PostMapping("/login")
    public Iterable<Registration> create(@RequestBody Login login) {
        return registrationService.findByUsernameAndPassword(login.getUsername(), login.getPassword());
    }







}
