package com.example.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class HelloWorldController {

  // need a controller method to show initial HTML form
  @GetMapping("/showForm") // only support GET requests
  public String showForm() {
      return "helloworld-form";
  }
  
  // need a controller method to process HTML form
  @RequestMapping("/processForm")
  public String processForm() {
      return "helloworld";
  }

  // need a controller method to read form data &
  // add data to the model
  @RequestMapping("/processFormVersionTwo")
  public String letsShoutDude(HttpServletRequest request, Model model) {

    // read the request parameter from HTML form
    String theName = request.getParameter("studentName");

    // convert data into all caps
    theName = theName.toUpperCase();

    // create the message
    String result = "Yo! " + theName;

    // add message to model
    model.addAttribute("message", result);

    return "helloworld";
  }

  @PostMapping("/processFormVersionThree")
  public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

    // convert data into all caps
    theName = theName.toUpperCase();

    // create the message
    String result = "Hey Dude! " + theName;

    // add message to model
    model.addAttribute("message", result);

    return "helloworld";
  }
}
