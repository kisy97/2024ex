package com.ktest.homeshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.ktest.homeshop.dto.MemberDTO;
import com.ktest.homeshop.service.MemberService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequiredArgsConstructor
public class HomeController {
	
	private final MemberService memberService;
	
	@GetMapping("index")
	public String home() {
		return "index";
	}
	
	@GetMapping("/save")
	public String save() {
		return "save";
	}
	
	@PostMapping("/save")
	public String save(MemberDTO dto) {
		//TODO: process POST request
		System.out.println("DTO = " + dto);
		memberService.save(dto);
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String findAll(Model model) {
		List<MemberDTO> memberDTOList = memberService.findAll();
		model.addAttribute("memberList", memberDTOList);
		System.out.println("memberList = " + memberDTOList);
		return "list";
	}
	
	@GetMapping("/{custno}")
	public String findByCustno(@PathVariable("custno") Integer custno, Model model) {
		MemberDTO memberDTO = memberService.findByCustno(custno);
		model.addAttribute("member", memberDTO);
		System.out.println("memberDTO = " + memberDTO);
		return "detail";
	}
	
	@GetMapping("/update/{custno}")
	public String update(@PathVariable("custno") Integer custno, Model model) {
		MemberDTO memberDTO = memberService.findByCustno(custno);
		model.addAttribute("member", memberDTO);
		return "update";
	}
	
	@PostMapping("/update/{custno}")
	public String update(MemberDTO memberDTO, Model model) {
		memberService.update(memberDTO);
		
		MemberDTO dto = memberService.findByCustno(memberDTO.getCustno());
		model.addAttribute("member", dto);
		return "detail";
	}
	
	
	
	
}
