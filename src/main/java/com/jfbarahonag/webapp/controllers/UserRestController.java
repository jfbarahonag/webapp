package com.jfbarahonag.webapp.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {
  
  @GetMapping("/details")
  public Map<String, Object> details() {
    Map<String, Object> response = new HashMap<>();

    List<Integer> grades = new ArrayList<>();
    grades.add(5);
    grades.add(4);

    response.put("title", "My Title");
    response.put("h1Title", "This is details page");
    response.put("username", "J Felipe B Gonza");
    response.put("age", 33);
    response.put("grades", grades);
    
    return response;
  }

}
