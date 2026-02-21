package com.example.spring_core_demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring_core_demo.common.Coach;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {

  // define a private field for the dependency
  private Coach myCoach;

  // constructor injection
  @Autowired
  public DemoController(@Qualifier("cricketCoach") Coach theCoach) {
    System.out.println("In constructor: " + getClass().getSimpleName());
    myCoach = theCoach;
  }

  // expose a new endpoint for daily workout
  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }
  
}
