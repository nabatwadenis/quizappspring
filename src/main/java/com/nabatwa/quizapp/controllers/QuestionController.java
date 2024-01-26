package com.nabatwa.quizapp.controllers;

import com.nabatwa.quizapp.models.Questions;
import com.nabatwa.quizapp.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public List<Questions> getAllQuestions(){
        return questionService.getAllQuestions();

    }
    @GetMapping("category/{category}")
    public List<Questions> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }
    @PostMapping("add")
    public String addQuestion(@RequestBody Questions question){
        return questionService.addQuestion(question);

    }
}
