package com.example.demo.controller;
import com.example.demo.Bean.BeanUser;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class RegisterController {
    @Autowired //Very Important!!! or NullPointer
    private UserMapper userMapper;

    @GetMapping("/Register")
    public String register(){
        return "Register";
    }

    @RequestMapping("/addUser")
    public String register(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        BeanUser checkUser = userMapper.selectName(username);// for checking if user is repeated!

        BeanUser user = new BeanUser();
        user.setId((int) (Math.random()*(100-1)+1));
        user.setUser_name(username);
        user.setPass_word(password);
        user.setE_mail(email);

        /* TODO: check if user is exists!*/
        if(checkUser != null){
            return "Repeat";
        }
        else{
            userMapper.insertUser(user);
            return "Login";
        }

    }
}
