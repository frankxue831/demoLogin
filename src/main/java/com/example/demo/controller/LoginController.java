package com.example.demo.controller;

import com.example.demo.Bean.BeanUser;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
public class LoginController {
    @Autowired // Careful!!!! very important !!!! or NULLPOINTER
    private UserMapper userMapper;

    private int count = 0;//count the times of log in

    /*TODO: change to postMapping maybe better
       get pass parameter and visible
       post pass request body, parameter is invisible, safe and secure*/
    @GetMapping("/Login")
    public String Login(){
        return "Login";
    }

    /**
     *
     * @param request get the log in process
     * @param model  save some temporary data like: username
     * @param map save some message for warning or success
     * @return welcome page or reject page
     */
    @RequestMapping("/addLogin")
    public String addLogin(HttpServletRequest request, Model model, Map<String, Object> map) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        map.put(username, password);
        //System.out.println(map.toString());

        //Not allow failed sign in more than 3 times
        if(count < 3){
            //BeanUser user = userMapper.selectName(username);
            BeanUser user = userMapper.verify(username, password);
            //System.out.println(user.toString());

            //if username, password can be found in table
            if(user != null){
                model.addAttribute("user", username);
                map.put("message", "Log In Success");

                return "hello";// go to
            }
            else{
                this.count = count + 1;
                map.put("message", "Log In Failed");
                System.out.println(count);
                return "Login";//back to log in page!
            }
        }
        else{
            count = 0; //refresh sign in count or page will keep locked!
            return "Reject";//go to reject page!
        }




    }


}

