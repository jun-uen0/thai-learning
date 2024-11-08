package com.thai.language.learning.controller;

import com.thai.language.learning.domain.ToneQuestion;
// import com.thai.language.learning.repository.ToneQuestionRepository;
import com.thai.language.learning.service.ToneQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/questions")
public class ToneQuestionController {

  // private static final Logger logger = LoggerFactory.getLogger(ToneQuestionController.class);

  @Autowired
  private ToneQuestionService toneQuestionService;

  // @Autowired
  // private ToneQuestionRepository toneQuestionRepository;

  @GetMapping("/tone-rules")
  public String getToneQuestion(Model model) {

    ToneQuestion question = toneQuestionService.getRandomToneQuestion();

    if (question == null) {
      // logger.warn("No tone rule questions available.");
      model.addAttribute("message", "No tone rule questions available.");
      return "error";
    }
    
    model.addAttribute("question", question);
    return "tone-question";
  }

  // @PostMapping("/tone-rules/check")
  // public String checkToneAnswer(@RequestParam Long questionId, @RequestParam String selectedAnswer, Model model) {
  //   logger.debug("Checking answer for question ID: {} with selected answer: {}", questionId, selectedAnswer);
  //   ToneQuestion question = toneQuestionRepository.findById(questionId)
  //       .orElse(null); // Find question by ID using repository
  //   if (question == null) {
  //     logger.error("Question with ID: {} not found.", questionId);
  //     model.addAttribute("message", "Question not found.");
  //     return "error";
  //   }

  //   boolean isCorrect = question.getCorrectAnswer().equals(selectedAnswer);
  //   logger.debug("Is the selected answer correct? {}", isCorrect);
  //   model.addAttribute("isCorrect", isCorrect);
  //   return "tone-result"; // Template to show if answer is correct
  // }
}
