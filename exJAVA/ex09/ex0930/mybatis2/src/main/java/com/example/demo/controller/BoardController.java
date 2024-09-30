package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
@RequiredArgsConstructor
public class BoardController {

	private final BoardService boardService;
	
	@GetMapping("/save")
	public String save() {
		return "save";
	}
	
	@PostMapping("/save")
	public String save(BoardDTO boardDTO) {
		//TODO: process POST request
		System.out.println("----- 콘솔값을 확인 ---------");
		System.out.println("DTO = " + boardDTO);
		return "index";
	}
	
	
}
