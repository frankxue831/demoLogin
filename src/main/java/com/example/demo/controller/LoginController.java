package com.example.demo.controller;

import com.example.demo.bean.BeanUser;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class LoginController {
    private UserMapper userMapper;

    @GetMapping("/Login")
    public String Login(){
        return "Login";
    }

    @RequestMapping("/addUser")
    public String register(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        BeanUser user = new BeanUser();
        user.setUser_name(username);
        user.setPass_word(password);
        user.setE_mail(email);
        userMapper.insertUser(user);
        return "Login";
    }
}

