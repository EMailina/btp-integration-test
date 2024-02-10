package com.globesy.btpintegrationtestapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/test")
	public String all() {
		return "test string";
	}

	@GetMapping("/random")
	public double random() {
		return Math.random();
	}
}
