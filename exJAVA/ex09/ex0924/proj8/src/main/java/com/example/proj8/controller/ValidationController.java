package com.example.proj8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.proj8.form.CalcForm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ValidationController {
	
	@ModelAttribute
	public CalcForm setUpForm() {
		return new CalcForm();
	}
	
	@GetMapping("show")
	public String showView() {
		return "entry";
	}
	
	@PostMapping("calc")
	public String confirmView(@Validated CalcForm form,
			BindingResult bindingResult, Model model) {
		//TODO: process POST request
		if(bindingResult.hasErrors()) {
			return "entry";
		}
		
		Integer result = form.getLeftNum() + form.getRightNum();
		
		model.addAttribute("result",result);
		return "confirm";
	}
	
	
}
