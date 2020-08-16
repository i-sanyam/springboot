package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/ping")
	public String home() {
		return "{status: 200, message: \"OK\", data: {}}";
	}
}
