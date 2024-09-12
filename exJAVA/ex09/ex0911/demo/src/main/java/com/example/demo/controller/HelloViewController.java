package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("hello")
public class HelloViewController {
	
	@GetMapping("view")
	public String helloview() {
		return "hello";
	}
	
}
