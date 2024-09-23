package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo2.form.Form;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RequestParamController {

	@GetMapping("show")
	public String showView() {
		return "entry";
	}

	@PostMapping("confirm")
	public String confirmView(Form f) {
		return "confirm2";
	}

}
