package com.jfbarahonag.webapp.models.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
  private List<Integer> grades = new ArrayList<Integer>();
  private String fullname;

  public List<Integer> getGrades() {
    return grades;
  }

  public void setGrades(List<Integer> grades) {
    this.grades = grades;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }
}
