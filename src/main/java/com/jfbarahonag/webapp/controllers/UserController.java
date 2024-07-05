package com.jfbarahonag.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jfbarahonag.webapp.models.User;

@Controller
public class UserController {
  
  @GetMapping("/details")
  public String details(Model model) {
    User user = new User("Juan Felipe", "Barahona Gonzalez", 28);
    
    model.addAttribute("title", "My Title");
    model.addAttribute("h1Title", "This is details page");
    model.addAttribute("user", user);
    return "details";
  }

}
