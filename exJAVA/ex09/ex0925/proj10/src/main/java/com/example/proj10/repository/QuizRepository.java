package com.example.proj10.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.proj10.entity.Quiz;

public interface QuizRepository extends CrudRepository<Quiz, Integer> {
	
}
