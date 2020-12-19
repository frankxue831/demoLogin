/*
  No using for this project! just for practicing the initializing SpringBoot!
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String Login(){
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World! Frank";
    }
}
