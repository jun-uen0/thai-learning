package com.thai.language.learning.service;

// QuestionService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thai.language.learning.domain.DifficultyLevel;
import com.thai.language.learning.domain.Question;
import com.thai.language.learning.repository.QuestionRepository;

import java.util.List;
import java.util.Random;

// Service class for question-related business logic
@Service
public class QuestionService {

  @Autowired
  private QuestionRepository questionRepository;

  // Retrieve a random question by difficulty level
// QuestionService.java

public Question getRandomQuestionByDifficulty(DifficultyLevel difficulty) {
  List<Question> questions = questionRepository.findByDifficultyLevel(difficulty);
  System.out.println("Questions found: " + questions.size());
  if (questions.isEmpty()) {
      return null;
  }
  return questions.get(new Random().nextInt(questions.size()));
}

  // Check if the selected answer is correct
  public boolean checkAnswer(Long questionId, String selectedAnswer) {
  Question question = questionRepository.findById(questionId).orElse(null);
  if (question == null) {
    return false;
  }
    return question.getCorrectAnswer().equals(selectedAnswer);
  }

  public String getCorrectAnswer(Long questionId) {
    Question question = questionRepository.findById(questionId)
      .orElseThrow(() -> new RuntimeException("Question not found"));
    return question.getCorrectAnswer();
  }
}
