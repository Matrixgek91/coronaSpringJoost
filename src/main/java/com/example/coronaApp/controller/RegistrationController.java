package com.example.coronaApp.controller;


import com.example.coronaApp.model.Registration;
import com.example.coronaApp.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RegistrationController {

    @Autowired private RegistrationService registrationService;

    @PostMapping("/corona_app")
    public Registration create(@RequestBody Registration registration) {
        return registrationService.save(registration);
    }

    @PutMapping("/corona_app")
    public Registration update(@RequestBody Registration registration) {
        return registrationService.save(registration);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @DeleteMapping("/corona_app/{userId}")
    public void delete(@PathVariable int userId) {
        registrationService.deleteById(userId);
    }

    @GetMapping("/corona_app")
    public List<Registration> findAll() {
        return (List<Registration>)registrationService.findAll();
    }

    @GetMapping("/corona_app/{userId}")
    public Optional<Registration> registrationById(@PathVariable int userId){
        return registrationService.findById(userId);
    }











}
