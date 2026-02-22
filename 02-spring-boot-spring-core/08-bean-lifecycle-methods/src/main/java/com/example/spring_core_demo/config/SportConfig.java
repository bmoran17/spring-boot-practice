package com.example.spring_core_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.spring_core_demo.common.SwimCoach;
import com.example.spring_core_demo.common.Coach;


@Configuration
public class SportConfig {

  @Bean("aquatic")
  public Coach swimCoach() {
    return new SwimCoach();
  }
  
}
