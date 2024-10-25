package com.ktest.homeshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktest.homeshop.dto.MoneyDTO;
import com.ktest.homeshop.repository.MoneyRepository;

@Service
public class MoneyService {
	
	@Autowired
	private MoneyRepository moneyRepository;
	
	public List<MoneyDTO> findAll() {
		return moneyRepository.findAll();
		
	}
}
