package com.ktest.audition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.ktest.audition.dto.ArtistDTO;
import com.ktest.audition.service.AuditionService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequiredArgsConstructor
public class AuditionController {

	private final AuditionService auditionService;
	
	@GetMapping("save")
	public String save() {
		return "save";
	}
	
	@PostMapping("/save")
	public String save(ArtistDTO artistDTO) {
		//TODO: process POST request
		auditionService.insertOne(artistDTO);
		return "redirect:/";
	}
	
	@GetMapping("/basic")
	public String listbasic(Model model) {
		model.addAttribute("artistList", auditionService.selectAll_basic());
		return "index";
	}
	
	@GetMapping("/")
	public String list(Model model) {
		model.addAttribute("artistList", auditionService.selectAll());
		return "index";
	}
	
	@GetMapping("/{artist_id}")
	public String findById(@PathVariable("artist_id") String artist_id,Model model) {
		System.out.println("===>>" + artist_id);
		model.addAttribute("artist", auditionService.selectOne(artist_id));
		return "detail";
	}
	
	@GetMapping("/update/{artist_id}")
	public String update(@PathVariable("artist_id") String artist_id, Model model) {
		artist_id = artist_id.replace('"',' ').trim();
		ArtistDTO artistDTO = auditionService.selectOne(artist_id);
		model.addAttribute("artist", artistDTO);
		return "update";
	}
	
	@PostMapping("/update/{artist_id}")
	public String update(ArtistDTO artistDTO,Model model) {
		//TODO: process POST request
		auditionService.update(artistDTO);
		
		ArtistDTO dto = auditionService.selectOne(artistDTO.getArtist_id());
		model.addAttribute("artist", dto);
		return "detail";
	}
	
	@GetMapping("/delete/{artist_id}")
	public String delete(@PathVariable("artist_id") String artist_id) {
		artist_id = artist_id.replace('"',' ').trim();
		
		auditionService.delete(artist_id);
		return "redirect:/";
	}
	
	@GetMapping("/pointlist")
	public String pointList(Model model) {
		model.addAttribute("pointList", auditionService.selectMentoPoint());
		return "list_point";
	}
	
	@GetMapping("/ranklist")
	public String rankList(Model model) {
		model.addAttribute("rankList", auditionService.selectRank());
		return "list_rank";
	}
	
	
	
	
	
	
}
