package com.example.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class InterceptorConfig  implements WebMvcConfigurer{
	
	@Autowired
	LoggingInterceptor login;
         
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		 
		registry.addInterceptor(login);
	}
}
