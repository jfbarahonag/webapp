package com.jfbarahonag.webapp.models;


public class User {
  private String firstName;
  private String lastName;
  private String email;
  private Integer age;

  public User() {
  }

  public User(String firstName, String lastName, Integer age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public User(String firstName, String lastName, Integer age, String email) {
    this(firstName, lastName, age);
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }  
  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }  
  
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }  
}
