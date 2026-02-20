package com.example.spring_core_demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.util.Coach;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoController {

  // define a private field for the dependency
  private Coach myCoach;

  //define a constructor for dependency injection
  @Autowired
  public DemoController(Coach theCoach) {
    myCoach = theCoach;
  }

  // expose a new endpoint for daily workout
  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }
  
}
