package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
	@GetMapping("/")
	public String Welcome()
	{
		return "Welcome Spring Boot!";
	}

}
