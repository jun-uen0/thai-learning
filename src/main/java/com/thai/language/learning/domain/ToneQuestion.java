package com.thai.language.learning.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ToneQuestion {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String thaiWord;
  private String correctAnswer;
  private String choice1;
  private String choice2;
  private String choice3;
  private String choice4;
  private String choice5;

  // Getters and Setters
  public Long getId() { return id; }
  public String getThaiWord() { return thaiWord; }
  public void setThaiWord(String thaiWord) { this.thaiWord = thaiWord; }
  public String getCorrectAnswer() { return correctAnswer; }
  public void setCorrectAnswer(String correctAnswer) { this.correctAnswer = correctAnswer; }
  public String getChoice1() { return choice1; }
  public void setChoice1(String choice1) { this.choice1 = choice1; }
  public String getChoice2() { return choice2; }
  public void setChoice2(String choice2) { this.choice2 = choice2; }
  public String getChoice3() { return choice3; }
  public void setChoice3(String choice3) { this.choice3 = choice3; }
  public String getChoice4() { return choice4; }
  public void setChoice4(String choice4) { this.choice4 = choice4; }
  public String getChoice5() { return choice5; }
  public void setChoice5(String choice5) { this.choice5 = choice5; }
}
