package com.nabatwa.quizapp.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
public class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private  String category;
    private String difficultyLevel;
    private String option1;
    private String option2;
    private String option3;




}
