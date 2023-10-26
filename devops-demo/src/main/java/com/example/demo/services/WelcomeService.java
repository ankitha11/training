package com.example.demo.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeService {
	
	@Autowired

	public String[] getCity() {
		return new String[] {"Chennai","Pune","Mumbai"};
	}

}
