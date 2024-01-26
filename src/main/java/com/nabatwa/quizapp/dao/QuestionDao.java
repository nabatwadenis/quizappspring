package com.nabatwa.quizapp.dao;

import com.nabatwa.quizapp.models.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionDao extends JpaRepository<Questions, Integer> {
    List<Questions> findByCategory(String category);


}
