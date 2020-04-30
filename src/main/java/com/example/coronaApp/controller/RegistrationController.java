package com.example.coronaApp.controller;


import com.example.coronaApp.model.Registration;
import com.example.coronaApp.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RegistrationController {

    @Autowired private RegistrationService registrationService;

    @PostMapping("/registration")
    public Registration create(@RequestBody Registration registration) {
        return registrationService.save(registration);
    }













}
