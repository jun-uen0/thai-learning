package com.thai.language.learning.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

// Entity class to represent a quiz question
@Entity
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  // Paiboon notation to display the phonetic representation
  private String paiboonNotation;

  // Correct answer in Thai script
  private String correctAnswer;

  // Difficulty level for the question
  @Enumerated(EnumType.STRING)
  private DifficultyLevel difficultyLevel;

  // List of possible answer choices
  @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
  private List<Choice> choices = new ArrayList<>();

  // Getter for id
  public Long getId() {
    return id;
  }

  // Getter for Paiboon Notation
  public String getPaiboonNotation() {
    return paiboonNotation;
  }

  // Getter for correctAnswer
  public String getCorrectAnswer() {
    return correctAnswer;
  }

  // Getter for choices
  public List<Choice> getChoices() {
    return choices;
  }

  // Setter for Paiboon Notation
  public void setPaiboonNotation(String paiboonNotation) {
    this.paiboonNotation = paiboonNotation;
  }

  // Setter for correctAnswer
  public void setCorrectAnswer(String correctAnswer) {
    this.correctAnswer = correctAnswer;
  }

  // Setter for difficulty level
  public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
  }

  // Setter for choices
  public void setChoices(List<Choice> choices) {
    this.choices = choices;
  }
}
