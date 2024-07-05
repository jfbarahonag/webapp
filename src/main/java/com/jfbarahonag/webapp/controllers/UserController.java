package com.jfbarahonag.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
  
  @GetMapping("/details")
  public String details(Model model) {
    model.addAttribute("title", "My Title");
    model.addAttribute("h1Title", "This is details page");
    model.addAttribute("username", "J Felipe B Gonza");
    model.addAttribute("age", 33);
    return "details";
  }

}
