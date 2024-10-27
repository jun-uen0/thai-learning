package com.thai.language.learning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.thai.language.learning.domain.Question;
import com.thai.language.learning.domain.Choice;
import com.thai.language.learning.domain.DifficultyLevel;
import com.thai.language.learning.repository.QuestionRepository;

import java.util.Arrays;

@Component
public class ExampleDataLoader implements CommandLineRunner {

  private final QuestionRepository questionRepository;

  public ExampleDataLoader(QuestionRepository questionRepository) {
    this.questionRepository = questionRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    Question question = new Question();
    question.setPaiboonNotation("bɛ̀ɛp thay");
    question.setCorrectAnswer("แบบไทย");
    question.setDifficultyLevel(DifficultyLevel.BEGINNER);

    Choice choice1 = new Choice("แบบไทย");
    choice1.setQuestion(question);  // Associate with the question
    Choice choice2 = new Choice("ญี่ปุ่น");
    choice2.setQuestion(question);  // Associate with the question
    Choice choice3 = new Choice("ภาษาอังกฤษ");
    choice3.setQuestion(question);  // Associate with the question
    Choice choice4 = new Choice("ชาวจีน");
    choice4.setQuestion(question);  // Associate with the question

    question.setChoices(Arrays.asList(choice1, choice2, choice3, choice4));
    questionRepository.save(question);
  }
}
