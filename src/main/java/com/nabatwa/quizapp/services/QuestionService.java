package com.nabatwa.quizapp.services;

import com.nabatwa.quizapp.dao.QuestionDao;
import com.nabatwa.quizapp.models.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public String addQuestion(Questions question) {
        questionDao.save(question);
        return "success";
    }

    public String deleteQuestion(Integer id) {
        // Check if the question exists
        if (questionDao.existsById(id)) {
            questionDao.deleteById(id);
            return "Question deleted successfully";
        } else {
            return "Question not found";
        }
    }
public String updateQuiz(Questions questions){

           questionDao.save(questions);
           return "updated successfuly";


}


}
