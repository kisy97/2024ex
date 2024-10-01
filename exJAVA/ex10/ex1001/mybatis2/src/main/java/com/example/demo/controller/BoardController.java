package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

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
	public String save(BoardDTO dto) {
		//TODO: process POST request
		System.out.println("DTO = " + dto);
		boardService.save(dto);
		
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String findAll(Model model) {
		List<BoardDTO> boardDTOList = boardService.findAll();
		model.addAttribute("boardList", boardDTOList);
		System.out.println("boardDTOList = " + boardDTOList);
		return "list";
	}
	
	
	
}
