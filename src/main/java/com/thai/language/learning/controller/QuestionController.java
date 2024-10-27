package com.thai.language.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thai.language.learning.domain.DifficultyLevel;
import com.thai.language.learning.domain.Question;
import com.thai.language.learning.service.QuestionService;

// import ch.qos.logback.core.model.Model;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/questions")
public class QuestionController {

  @Autowired
  private QuestionService questionService;

  @GetMapping("/{difficulty}")  // 修正: "/questions/{difficulty}" ではなく "/{difficulty}"
  public String getQuestionByDifficulty(@PathVariable DifficultyLevel difficulty, Model model) {
    System.out.println("Received request for difficulty: " + difficulty);
    
    Question question = questionService.getRandomQuestionByDifficulty(difficulty);
    if (question == null) {
      model.addAttribute("message", "No questions available for the selected difficulty level.");
      return "error";  // error.htmlテンプレートを用意します
    }
  
    model.addAttribute("question", question);
    model.addAttribute("choices", question.getChoices()); // 選択肢を追加
    return "question";  // question.htmlテンプレートを返します
  }

  @PostMapping("/check")
  public String checkAnswer(@RequestParam Long questionId, @RequestParam String selectedAnswer, Model model) {
    boolean isCorrect = questionService.checkAnswer(questionId, selectedAnswer);
    String correctAnswer = questionService.getCorrectAnswer(questionId); // Get the correct answer
    model.addAttribute("isCorrect", isCorrect);
    model.addAttribute("correctAnswer", correctAnswer); // Add the correct answer to the model
    return "result";
  }
}
