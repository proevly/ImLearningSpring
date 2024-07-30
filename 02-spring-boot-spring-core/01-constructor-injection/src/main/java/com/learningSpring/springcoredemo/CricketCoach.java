package com.learningSpring.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Practice for Cricket Coach";
    }
}
