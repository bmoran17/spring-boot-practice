package com.example.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

  // define bean for CommandLineRunner for creating a command line application
  // executes after Spring Beans are initialized 
  // allows execution of custom code => "Hello world" after application starts
  @Bean
  public CommandLineRunner commandLineRunner(String[] args) {
    
    // Java Lambda expression 
    // shortcut notation for providing an implementation of command line runner interface
    return runner -> {
      System.out.println("Hello world");
    };
}

}
