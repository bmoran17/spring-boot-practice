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
}
