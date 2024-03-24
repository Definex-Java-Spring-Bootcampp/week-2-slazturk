package com.patika.kredinbizdeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.service.ApplicationService;

@RestController
@RequestMapping("api/applications")
public class ApplicationController {
	
	@Autowired
    private ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)//Kredi başvurularını kaydeden end-point’i yazın.
    public Application createOrder(@RequestBody Application application) {
        
        return applicationService.save(application);
    }
	
	@GetMapping("/{email}") //email adresi ile kullanıcının bütün başvurularını listeleyen end-point’i yazın
    public Application getByEmail(@PathVariable String email) {
        return applicationService.getByEmail(email);
    }
	
}
