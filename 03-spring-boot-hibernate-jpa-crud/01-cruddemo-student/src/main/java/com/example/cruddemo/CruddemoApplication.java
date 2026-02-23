package com.example.cruddemo;

import java.util.List;

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
      // readStudent(studentDAO);
      // queryForStudents(studentDAO);
      // queryForStudenstLastName(studentDAO);
      // updateStudent(studentDAO);
      // deleteStudent(studentDAO);
      // deleteAllStudents(studentDAO);

    };
}
  private void deleteAllStudents(StudentDAO studentDAO) {

    System.out.println("Deleting all students");
    int numsRowsDeleted = studentDAO.deleteAll();
    System.out.println("Deleted row count: " + numsRowsDeleted);
  }

  private void deleteStudent(StudentDAO studentDAO) {

    int studentId = 3;
    System.out.println("Deleting student id: " + studentId);
    studentDAO.delete(studentId);
  }

  private void updateStudent(StudentDAO studentDAO) {

    // retrieve student based on the id: primary key
    int studentId = 1;
    System.out.println("Getting student with id: " + studentId);
    Student myStudent = studentDAO.findById(studentId);

    // change first name to "Scooby"
    System.out.println("Updating student ... ");
    myStudent.setFirstName("Jimmy");
    
    // update the student
    studentDAO.update(myStudent);
    
    // display the updated student
    System.out.println("Updated student: " + myStudent);
  }

  private void queryForStudenstLastName(StudentDAO studentDAO) {
    
    // get a list of students
    List<Student> theStudents = studentDAO.findByLastName("Salvatore");

    // display list of students
    for (Student tempStudent : theStudents) {
      System.out.println(tempStudent);
    }
  }

  private void queryForStudents(StudentDAO studentDAO) {

    // get a list of students
    List<Student> theStudents = studentDAO.findAll();

    // display list of students
    for (Student tempStudent : theStudents) {
      System.out.println(tempStudent);
    }
  }

  private void readStudent(StudentDAO studentDAO) {

    // create a student object
    System.out.println("Creating new student object ...");
    Student tempStudent = new Student("Uncle", "Iroh","iroh@gmail.com");

    // save the student
    System.out.println("Saving the student ... ");
    studentDAO.save(tempStudent);

    // display id of saved student
    int theId = tempStudent.getId();
    System.out.println("Saved student. Generated id: " + theId);

    // retrieve student based on the id: primary key
    System.out.println("Retrieving student with id: " + theId);
    Student myStudent = studentDAO.findById(theId);

    // display student
    System.out.println("Found the student: " + myStudent);
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
