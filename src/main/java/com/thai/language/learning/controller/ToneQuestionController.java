package com.thai.language.learning.controller;

import com.thai.language.learning.domain.ToneQuestion;
// import com.thai.language.learning.repository.ToneQuestionRepository;
import com.thai.language.learning.service.ToneQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/questions")
public class ToneQuestionController {

  @Autowired
  private ToneQuestionService toneQuestionService;

  @GetMapping("/tone-rules")
  public String getToneQuestion(Model model) {

    ToneQuestion question = toneQuestionService.getRandomToneQuestion();

    if (question == null) {
      model.addAttribute("message", "No tone rule questions available.");
      return "error";
    }
    
    model.addAttribute("question", question);
    return "tone-question";
  }

  @PostMapping("/tone-rules/check")
  public String checkToneAnswer(@RequestParam Long questionId, @RequestParam String selectedAnswer, Model model) {

    ToneQuestion question = toneQuestionService.getRandomToneQuestion();

    if (question == null) {
      model.addAttribute("message", "Question not found.");
      return "error";
    }

    boolean isCorrect = question.getCorrectAnswer().equals(selectedAnswer);

    // TODO: Handle no select (Error page with no select)

    model.addAttribute("isCorrect", isCorrect);
    return "tone-result";
  }
}
