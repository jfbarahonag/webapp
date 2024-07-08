package com.jfbarahonag.webapp.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfbarahonag.webapp.models.User;
import com.jfbarahonag.webapp.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {
  
  @GetMapping("/details/map")
  public Map<String, Object> detailsMap() {
    Map<String, Object> response = new HashMap<>();
    User user = new User("Juan Felipe", "Barahona Gonzalez", 28);

    List<Integer> grades = new ArrayList<>();
    grades.add(5);
    grades.add(4);

    response.put("user", user);
    response.put("grades", grades);
    
    return response;
  }
  
  @GetMapping("/details/dto")
  public UserDto detailsDto() {
    UserDto userDto = new UserDto();

    User user = new User("Juan Felipe", "Barahona Gonzalez", 28);

    List<Integer> grades = new ArrayList<>();
    grades.add(3);
    grades.add(3);

    userDto.setFullname(
      user.getFirstName()
        .concat(" ")
          .concat(user.getLastName())
    );
    userDto.setGrades(grades);

    return userDto;
  }

}
