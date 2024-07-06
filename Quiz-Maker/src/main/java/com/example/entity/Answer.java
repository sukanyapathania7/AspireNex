package com.example.entity;





import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long quizId;

    private Long questionId;

    private int selectedAnswerIndex;

    private boolean correct;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getQuizId() {
		return quizId;
	}

	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public int getSelectedAnswerIndex() {
		return selectedAnswerIndex;
	}

	public void setSelectedAnswerIndex(int selectedAnswerIndex) {
		this.selectedAnswerIndex = selectedAnswerIndex;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public Answer(Long id, Long quizId, Long questionId, int selectedAnswerIndex, boolean correct) {
		super();
		this.id = id;
		this.quizId = quizId;
		this.questionId = questionId;
		this.selectedAnswerIndex = selectedAnswerIndex;
		this.correct = correct;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}
