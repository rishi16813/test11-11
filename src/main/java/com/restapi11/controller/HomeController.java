package com.restapi11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {
	@GetMapping("/login")
	public String login() {
		return "Logged in succeeded";
	}
	@PostMapping("/signup")
	public String signup() {
		return "signup is succeeded";
	}

}
