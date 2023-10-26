package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class WelcomeService {
	
	

	public String[] getCity() {
		return new String[] {"Chennai","Pune","Mumbai"};
	}

}
