package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RejectController {

    @GetMapping("/Reject")
    public String Login(){
        return "Reject";
    }

}
