package com.tts3.heroku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping(value = "/")
	public String home() {
		return"Hello!";
	}

}
