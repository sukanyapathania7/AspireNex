package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Answer;
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}

