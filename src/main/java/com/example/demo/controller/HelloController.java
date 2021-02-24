/*
  No using for this project! just for practicing the initializing SpringBoot!
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Login(){
        return "hello";
    }


    @RequestMapping("/hello2")
    public String handle02(){
        return "Hello World! Spring boot !";
    }
}
