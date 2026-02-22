package com.example.spring_core_demo.common;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// class that implements the Coach interface
@Component
public class CricketCoach implements Coach {

  public CricketCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  // define init method
  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
  }

  // define destroy method
  @PreDestroy
  public void doMyCleanupStuff() {
    System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes";
  }
}
