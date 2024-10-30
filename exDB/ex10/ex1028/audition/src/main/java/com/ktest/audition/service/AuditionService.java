package com.ktest.audition.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ktest.audition.dto.ArtistDTO;
import com.ktest.audition.dto.PointDTO;
import com.ktest.audition.repository.ArtistRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuditionService {
	private final ArtistRepository artistRepository;
	
	public void insertOne(ArtistDTO artistDTO) {
		artistRepository.insertOne(artistDTO);
	}
	
	public List<ArtistDTO> selectAll_basic() {
		return artistRepository.selectAll_basic();
	}
	
	public List<ArtistDTO> selectAll() {
		return artistRepository.selectAll();
	}
	
	public ArtistDTO selectOne(String artist_id) {
		return artistRepository.selectOne(artist_id);
	}
	
	public void update(ArtistDTO artistDTO) {
		artistRepository.update(artistDTO);
	}
	
	public void delete(String artist_id) {
		artistRepository.delete(artist_id);
	}
	
	public List<PointDTO> selectMentoPoint(){
		return artistRepository.selectMentoPoint();
	}
	
	public List<PointDTO> selectRank() {
		return artistRepository.selectRank();
	}




}
