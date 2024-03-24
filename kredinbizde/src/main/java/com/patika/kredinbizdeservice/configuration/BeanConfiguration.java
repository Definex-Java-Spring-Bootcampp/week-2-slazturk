package com.patika.kredinbizdeservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.patika.kredinbizdeservice.service.ApplicationService;
import com.patika.kredinbizdeservice.service.IUserService;
import com.patika.kredinbizdeservice.service.UserService2;

@Configuration
public class BeanConfiguration {

    @Bean
    public IUserService userService4() {
        return new UserService2();
    }
    
    @Bean
    public ApplicationService applicationService() {
    	return new ApplicationService();
    }
}