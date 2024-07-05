package com.jfbarahonag.webapp.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfbarahonag.webapp.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {
  
  @GetMapping("/details")
  public Map<String, Object> details() {
    Map<String, Object> response = new HashMap<>();
    User user = new User("Juan Felipe", "Barahona Gonzalez", 28);

    List<Integer> grades = new ArrayList<>();
    grades.add(5);
    grades.add(4);

    response.put("user", user);
    response.put("grades", grades);
    
    return response;
  }

}
