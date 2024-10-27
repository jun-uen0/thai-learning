package com.thai.language.learning.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Choice {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String thaiText;

  @ManyToOne
  @JoinColumn(name = "question_id")
  private Question question;

  // Default constructor
  public Choice() {
  }

  // Constructor with thaiText
  public Choice(String thaiText) {
    this.thaiText = thaiText;
  }

  // Getter and Setter for thaiText
  public String getThaiText() {
    return thaiText;
  }

  public void setThaiText(String thaiText) {
    this.thaiText = thaiText;
  }

  // Getter and Setter for question
  public Question getQuestion() {
    return question;
  }

  public void setQuestion(Question question) {
    this.question = question;
  }
}
