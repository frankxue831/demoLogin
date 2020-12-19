package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class RepeatRegController {
    @GetMapping("/Repeat")
    public String Login(){
        return "Repeat";
    }
}
