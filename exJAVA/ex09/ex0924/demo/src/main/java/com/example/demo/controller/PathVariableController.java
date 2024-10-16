package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class PathVariableController {

	@GetMapping("show")
	public String showView() {
		return "show";
	}
	
	@GetMapping("function/{no}")
	public String selectFunction(@PathVariable("no") Integer no) {
		String view = null;
		switch (no) {
		case 1:
			view = "pathvariable/function1";
			break;
		case 2:
			view = "pathvariable/function2";
			break;
		case 3:
			view = "pathvariable/function3";
			break;
		}
		
		return view;
	}
	
	@PostMapping(value = "send", params = "a")
	public String showAView() {
		//TODO: process POST request
		
		return "submit/a";
	}
	@PostMapping(value = "send", params = "b")
	public String showBView() {
		//TODO: process POST request
		
		return "submit/b";
	}
	@PostMapping(value = "send", params = "c")
	public String showCView() {
		//TODO: process POST request
		
		return "submit/c";
	}
	
	
}
