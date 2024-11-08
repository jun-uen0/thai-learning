package com.thai.language.learning.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thai.language.learning.domain.ToneQuestion;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@Service
public class ToneQuestionService {

  private List<ToneQuestion> questions;

  public ToneQuestionService() {
    loadQuestionsFromJson();
  }

  // JSONファイルから質問を読み込むメソッド
  private void loadQuestionsFromJson() {
    ObjectMapper mapper = new ObjectMapper();
    try {
      questions = mapper.readValue(new File("src/main/resources/toneQuestions.json"), new TypeReference<List<ToneQuestion>>(){});
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  // ランダムにトーンルールの質問を取得
  public ToneQuestion getRandomToneQuestion() {
    if (questions == null || questions.isEmpty()) {
      return null;
    }
    return questions.get(new Random().nextInt(questions.size()));
  }
}
