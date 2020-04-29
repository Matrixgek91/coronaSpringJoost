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

    @PostMapping("/registration")
    public Registration create(@RequestBody Registration registration) {
        return registrationService.save(registration);
    }

    @PutMapping("/registration")
    public Registration update(@RequestBody Registration registration) {
        return registrationService.save(registration);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @DeleteMapping("/registration/{userId}")
    public void delete(@PathVariable int userId) {
        registrationService.deleteById(userId);
    }

    @GetMapping("/registration")
    public List<Registration> findAll() {
        return (List<Registration>)registrationService.findAll();
    }

    @GetMapping("/registration/{userId}")
    public Optional<Registration> registrationById(@PathVariable int userId){
        return registrationService.findById(userId);
    }











}
