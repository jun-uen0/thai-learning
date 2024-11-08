package com.thai.language.learning.service;

import com.thai.language.learning.domain.ToneQuestion;
import com.thai.language.learning.repository.ToneQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ToneQuestionService {

  @Autowired
  private ToneQuestionRepository toneQuestionRepository;

  // Get a random tone question
  public ToneQuestion getRandomToneQuestion() {
    List<ToneQuestion> questions = toneQuestionRepository.findAll();
    return questions.isEmpty() ? null : questions.get(new Random().nextInt(questions.size()));
  }
}
