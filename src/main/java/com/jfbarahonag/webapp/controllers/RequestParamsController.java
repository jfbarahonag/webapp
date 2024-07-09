package com.jfbarahonag.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jfbarahonag.webapp.models.dto.ParamDto;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

  @GetMapping("/foo")
  public ParamDto foo(
    @RequestParam(required = false, defaultValue = "hey dude, this is a default value") String message) {
    
    ParamDto param = new ParamDto();
    param.setMessage(message);
    
    return param;
  }

  @GetMapping("/bar")
  public ParamDto bar(
    @RequestParam() String text,
    @RequestParam(required = false, defaultValue = "2") Integer code
  ) {

    ParamDto param = new ParamDto();
    param.setMessage(text);
    param.setCode(code);
    
    return param;
  }

}
