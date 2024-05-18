package com.Microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Microservices.limitsservice.configuration.LimitConfiguration;
import com.Microservices.limitsservice.model.LimitService;

@RestController
@RequestMapping("/api")
public class LimitServiceController {

	@Autowired
	private LimitConfiguration configuration;
	
	@GetMapping("/limit")
	public LimitService getLimit()
	{
		//return new LimitService(0, 100); // adding hard coded value for testing
		return new LimitService(configuration.getMin(), configuration.getMax());
	}
	
}
