package com.example.spring_core_demo.common;

// not using @Component 
// configured as Spring bean using @Bean
public class SwimCoach implements Coach {

  public SwimCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }
  
  @Override
  public String getDailyWorkout() {
    return "Swim 10,000 meters as a warm up";
  }
}
