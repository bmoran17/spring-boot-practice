package com.example.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

  // define bean for CommandLineRunner for creating a command line application
  // executes after Spring Beans are initialized 
  // allows execution of custom code => "Hello world" after application starts
  @Bean
  public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
    
    // Java Lambda expression 
    // shortcut notation for providing an implementation of command line runner interface
    return runner -> {
      // createStudent(studentDAO);
      createMultipleStudents(studentDAO);
    };
}

  private void createMultipleStudents(StudentDAO studentDAO) {

    // create multiple students
    System.out.println("Creating 3 student objects ...");
    Student tempStudent1 = new Student("Thor", "White","thor@gmail.com");
    Student tempStudent2 = new Student("Damon", "Salvatore","damon@gmail.com");
    Student tempStudent3 = new Student("Nancy", "Wheeler","nancy@gmail.com");


    // save the student objects
    System.out.println("Saving the students ... ");
    studentDAO.save(tempStudent1);
    studentDAO.save(tempStudent2);
    studentDAO.save(tempStudent3);
  }

  private void createStudent(StudentDAO studentDAO) {

    // create the student object
    System.out.println("Creating new student object ...");
    Student tempStudent = new Student("Loki", "Doe","loki@gmail.com");

    // save the student object
    System.out.println("Saving the student ... ");
    studentDAO.save(tempStudent);
  
    // display id of the saved student
    System.out.println("Saved student. Generated id: " + tempStudent.getId());
  }

}
