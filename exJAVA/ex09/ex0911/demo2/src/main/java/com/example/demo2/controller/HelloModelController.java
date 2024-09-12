package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("hello")
public class HelloModelController {
	
	@GetMapping("model")
	public String helloView(Model model) {
		model.addAttribute("msg","타임리프!!!");
		
		return "helloThymeleaf";
	}
	
}
