# Spring Boot 4 Practice
## 01: Spring Boot Overview Projects
- Spring Boot Demo
  - Added a REST controller to handle "/" & return "Hello World"
- Dev Tools Demo
  - Added Spring Boot DevTools & new endpoints to test app automaticaly restarts when modifying code
- Actuator Demo
  - Added Spring Boot Actuator & tested the endpoints /actuator/info,health,beans,mapping,threaddump
- Actuator Security Demo
  - Added Spring Boot Starter Security to secured all actuator endpoints
- Command Line Demo
  - Tested running Spring App from command line 2 ways:
  - Packaging App & running JAR file:`mvn package` & `java -jar` 
  - Spring Boot Maven Plugin:`mvn spring-boot:run`
- Property Demo
  - Defined custom properties in file `application.properties`
  - Set context path to "/mycoolapp"
  - Changed embedded server port to 7070 
  - Injected properties into Spring App 
  - Exposed new endpoint for "/teaminfo" to display properties

## 02: Spring Boot Spring Core Projects
- Constructor Injection
  - Defined dependency interface & class that implements it 
  - Created REST controller
  - Defined constructor for dependency injection
  - Exposed REST endpoint
- Component Scanning
  - Created sub packages inside main Spring Boot app class & moved classes inside
    - Ran app to test component scanning works properly
  - Created sub packages outside main Spring Boot app class
    - had to explicitly configure base packages in `@SpringBootApplication` in order for component scanning to work 
