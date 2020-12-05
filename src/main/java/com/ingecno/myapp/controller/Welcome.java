package com.ingecno.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Welcome {

	@GetMapping("/to/{name}")
	public String  welcomeTo(@PathVariable String name) {
		
		
		return "WELCOME TO MYAPP"+name;
		
		
	}
}
