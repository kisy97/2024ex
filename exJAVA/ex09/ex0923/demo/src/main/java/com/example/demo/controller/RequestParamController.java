package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.form.Form;

import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class RequestParamController {

	@GetMapping("show")
	public String showView() {
		return "entry";
	}
	
	/*
	 * @PostMapping("confirm") public String confirmView( Model
	 * model, @RequestParam("name") String name, @RequestParam("age") Integer age,
	 * 
	 * @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("birth")
	 * LocalDate birth) { //TODO: process POST request
	 * model.addAttribute("name",name); model.addAttribute("age",age);
	 * model.addAttribute("birth",birth);
	 * 
	 * return "confirm"; }
	 */
	@PostMapping("confirm")
	public String confirmView(Form f) {
		return "confirm2";
	}
	
}
