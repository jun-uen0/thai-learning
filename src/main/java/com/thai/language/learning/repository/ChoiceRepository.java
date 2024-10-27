package com.thai.language.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thai.language.learning.domain.Choice;

// Repository for accessing Choice entities
public interface ChoiceRepository extends JpaRepository<Choice, Long> {
}
