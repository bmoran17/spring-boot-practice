package com.example.spring_core_demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring_core_demo.common.Coach;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {

  // define a private field for the dependency
  private Coach myCoach;

  // setter method for dependency injection
  // method name can be anything - setCouch, doSomeStuff, etc.
  @Autowired
  public void doSomeStuff(Coach theCoach) {
    myCoach = theCoach;
  }

  // expose a new endpoint for daily workout
  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }
  
}
