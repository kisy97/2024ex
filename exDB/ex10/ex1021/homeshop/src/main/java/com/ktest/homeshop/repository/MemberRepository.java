package com.ktest.homeshop.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.ktest.homeshop.dto.MemberDTO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
	
	private final SqlSessionTemplate sql;
	
	public MemberDTO save(MemberDTO dto) {
		sql.insert("Member.save", dto);
		return dto;
	}
	
	public List<MemberDTO> findAll() {
		return sql.selectList("Member.findAll");
	}
	
	public MemberDTO findByCustno(Integer custno) {
		return sql.selectOne("Member.findByCustno", custno);
	}
	
	public void update(MemberDTO memberDTO) {
		sql.update("Member.update", memberDTO);
	}
	
	public void delete(Integer custno) {
		sql.delete("Member.delete", custno);
	}
}
