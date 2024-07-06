package com.example.service;



public interface QuizTakingService {

    void startQuizSession(Long quizId);

    void submitAnswer(Long quizId, Long questionId, int selectedAnswerIndex);

    boolean isQuizSessionActive(Long quizId);

    void endQuizSession(Long quizId);

    boolean hasNextQuestion(Long quizId, Long currentQuestionId);

    Long getNextQuestionId(Long quizId, Long currentQuestionId);

    boolean isFirstQuestion(Long quizId, Long currentQuestionId);

    Long getFirstQuestionId(Long quizId);

    int calculateScore(Long quizId);

    // Other methods as needed
}
