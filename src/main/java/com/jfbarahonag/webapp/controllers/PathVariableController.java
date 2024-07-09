package com.jfbarahonag.webapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfbarahonag.webapp.models.User;
import com.jfbarahonag.webapp.models.dto.ParamDto;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

  @Value("${config.username}")
  private String username;

  // @Value("${config.message}")
  // private String message;

  @Value("${config.listOfEnvs}")
  private String[] listOfEnvs;

  @GetMapping("/baz/{message}")
  public ParamDto baz(@PathVariable String message) {
    
    ParamDto param = new ParamDto();
    param.setMessage(message);

    return param;
  }

  @GetMapping("/baz/{product}/mix/{id}")
  public Map<String, Object> bazMix(
    @PathVariable String product,
    @PathVariable Long id
  ) {
    Map<String, Object> json = new HashMap<>();
    json.put("product", product);
    json.put("id", id);

    return json;
  }

  @PostMapping("/users")
  public User createUser(@RequestBody User user) {

    user.setFirstName(user.getFirstName().toUpperCase());
    user.setLastName(user.getLastName().toUpperCase());

    return user;
  }

  @GetMapping("/config")
  public Map<String, Object> config(
    @Value("${config.message}") String message
  ) {
    Map<String, Object> json = new HashMap<>();

    json.put("username", username);
    json.put("message", message);
    json.put("listOfEnvs", listOfEnvs);

    return json;
  }
}
