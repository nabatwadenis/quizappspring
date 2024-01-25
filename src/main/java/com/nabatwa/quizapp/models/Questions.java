package com.nabatwa.quizapp.models;

import jakarta.persistence.*;
import lombok.Data;

import javax.annotation.processing.Generated;
@Data
@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer Id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private  String rightAnswer;
    @Column(nullable = false)
    private String difficultyLevel;
    private String category;
}
