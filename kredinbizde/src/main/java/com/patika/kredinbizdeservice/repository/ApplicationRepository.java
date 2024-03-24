package com.patika.kredinbizdeservice.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.patika.kredinbizdeservice.model.Application;

public class ApplicationRepository {

	private List<Application> applicationList = new ArrayList<>();

    public void save(Application application) {
    	applicationList.add(application);
    }
    
    public Optional<Application> findByEmail(String email) {
        return applicationList.stream()
                .filter(application -> application.getUser().getEmail().equals(email))
                .findFirst();
    }
}
