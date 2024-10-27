package com.thai.language.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thai.language.learning.domain.DifficultyLevel;
import com.thai.language.learning.domain.Question;
import java.util.List;

// Repository for accessing Question entities
public interface QuestionRepository extends JpaRepository<Question, Long> {
  List<Question> findByDifficultyLevel(DifficultyLevel difficultyLevel);
}
