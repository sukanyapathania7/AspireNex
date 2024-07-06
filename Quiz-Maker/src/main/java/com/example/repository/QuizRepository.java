package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Quiz;
@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
	}


