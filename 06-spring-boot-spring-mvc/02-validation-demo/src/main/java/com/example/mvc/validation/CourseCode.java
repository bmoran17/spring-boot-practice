package com.example.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

  // helper class that contains business rules/validation rules
@Constraint(validatedBy = CourseCodeConstraintValidator.class) 
  // can apply annotation to a method or field 
@Target({ElementType.METHOD, ElementType.FIELD})
  // retain this annotation in Java class file, process it at runtime
@Retention(RetentionPolicy.RUNTIME) 
public @interface CourseCode {

  // define default course code
  public String value() default "LUV";

  // define default error message
  public String message() default "must start with LUV";

  // define default groups: can group related constraints
  // no grouping constraints => default group
  public Class<?>[] groups() default{};

  // define default payloads: provide custom details about validation failure (severity level, error code, etc.)
  // none here => use default
  public Class<? extends Payload>[] payload() default{};

} 
