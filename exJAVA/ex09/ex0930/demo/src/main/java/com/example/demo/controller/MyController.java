package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Member;
import com.example.demo.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class MyController {
	
	@Autowired
	private MyService myService;
	
	@GetMapping("member")
	public List<Member> getrMember() {
		List<Member> list = myService.selectMember();
		return list;
	}
	
	
}
