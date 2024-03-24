package com.patika.kredinbizdeservice.service;

import java.util.Optional;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.repository.ApplicationRepository;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ApplicationService {
	
    private ApplicationRepository applicationRepository=new ApplicationRepository();

    public Application save(Application application) {
    	//System.out.println("applicationRepository: " + applicationRepository.hashCode());
        applicationRepository.save(application);
        return application;
    }
    
    public Application getByEmail(String email) {

        Optional<Application> foundApplication = applicationRepository.findByEmail(email);

        Application application = null;

        if (foundApplication.isPresent()) {
        	application = foundApplication.get();
        }

        return application;

    }

}