package com.ktest.homeshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktest.homeshop.dto.MemberDTO;
import com.ktest.homeshop.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	public void save(MemberDTO dto) {
		memberRepository.save(dto);
	}
	
	public List<MemberDTO> findAll() {
		return memberRepository.findAll();
	}
	
	public MemberDTO findByCustno(Integer custno) {
		return memberRepository.findByCustno(custno);
	}
	
	public void update(MemberDTO memberDTO) {
		memberRepository.update(memberDTO);
	}
	
	public void delete(Integer custno) {
		memberRepository.delete(custno);
	}
}
