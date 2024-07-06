package com.example.service;

import com.example.entity.Quiz;

public interface QuizService {
    Quiz createQuiz(Quiz quiz);
    Quiz getQuizById(Long id);
    Quiz updateQuiz(Quiz quiz);
    void deleteQuiz(Long id);
    // Other methods
}
