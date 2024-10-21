package com.ktest.homeshop.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Testcontroller {
	
	@GetMapping("test/url")
	public String select() {
		return "myurl 테스트";
	}
	
}
