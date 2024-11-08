package com.thai.language.learning.domain;

import java.util.List;

public class ToneQuestion {
  
  private Long id;
  private String thaiWord;
  private String correctAnswer;
  private List<String> choices;  // 選択肢をリスト形式で管理

  // Getters and Setters
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public String getThaiWord() { return thaiWord; }
  public void setThaiWord(String thaiWord) { this.thaiWord = thaiWord; }
  public String getCorrectAnswer() { return correctAnswer; }
  public void setCorrectAnswer(String correctAnswer) { this.correctAnswer = correctAnswer; }
  public List<String> getChoices() { return choices; }
  public void setChoices(List<String> choices) { this.choices = choices; }
}
