package com.jfbarahonag.webapp.models.dto;

import java.util.ArrayList;
import java.util.List;

import com.jfbarahonag.webapp.models.User;

public class UserDto {
  private List<Integer> grades = new ArrayList<Integer>();
  private User user;

  public List<Integer> getGrades() {
    return grades;
  }

  public void setGrades(List<Integer> grades) {
    this.grades = grades;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
