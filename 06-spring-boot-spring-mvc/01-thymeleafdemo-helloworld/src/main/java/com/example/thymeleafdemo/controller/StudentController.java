package com.example.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.example.thymeleafdemo.model.Student;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class StudentController {

  // injects data from properties file
  @Value("${countries}")
  private List<String> countries;

  // injects data from properties file
  @Value("${languages}")
  private List<String> languages;

    // injects data from properties file
  @Value("${systems}")
  private List<String> systems;
  
  @GetMapping("/showStudentForm")
  public String showForm(Model theModel) {

    // create a student object
    Student theStudent = new Student();

    // add student object to the model
    theModel.addAttribute("student", theStudent);

    // add list of countries to model
    theModel.addAttribute("countries", countries);

    // add list of languages to model
    theModel.addAttribute("languages", languages);
    
    // add list of systems to model
    theModel.addAttribute("systems", systems);
    return "student-form";
  }

  @PostMapping("/processStudentForm")
  public String processForm(@ModelAttribute("student") Student theStudent) {
      
    // log the input data
    System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());

    return "student-confirmation";
  }

}
