package com.example.my_app;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {
  
  // expose "/" that returns "Hello World"
  @GetMapping("/")
  public String sayHello() {
    return "Hello World!";
  }

  // expose a new endpoint for "workout"
  @GetMapping("/workout")
  public String getDailyWorkout() {
    return "Run a hard 5k!";
  }

  // expose a new endpoint for "fortune"
  @GetMapping("fortune")
  public String getDailyFortune() {
    return "Today is your lucky day.";
  } 
}
