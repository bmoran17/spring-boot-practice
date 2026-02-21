package com.example.spring_core_demo.common;
import org.springframework.stereotype.Component;

// class that implements the Coach interface
@Component
public class CricketCoach implements Coach {

  public CricketCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes";
  }
}
