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

    public Entity() {
    }

    public Entity(int id, String category, String difficultyLevel, String option1, String option2, String option3) {
        Id = id;
        this.category = category;
        this.difficultyLevel = difficultyLevel;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "Id=" + Id +
                ", category='" + category + '\'' +
                ", difficultyLevel='" + difficultyLevel + '\'' +
                ", option1='" + option1 + '\'' +
                ", option2='" + option2 + '\'' +
                ", option3='" + option3 + '\'' +
                '}';
    }
}
