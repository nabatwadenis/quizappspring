package com.nabatwa.quizapp.services;

import com.nabatwa.quizapp.dao.QuestionDao;
import com.nabatwa.quizapp.models.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Questions> getAllQuestions(){
        return questionDao.findAll();

    }

    public List<Questions> getQuestionByCategory(String category) {
        System.out.println(questionDao.findByCategory(category));
        return questionDao.findByCategory(category);
    }
}
