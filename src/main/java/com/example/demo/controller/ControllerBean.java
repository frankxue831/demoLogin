package com.example.demo.controller;

import com.example.demo.Bean.BeanUser;

import com.example.demo.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController

public class ControllerBean {

    @Autowired

    UserMapper beanUserMapper;

    //查询

    @RequestMapping("/get/{id}")

    public BeanUser getBeanUser(@PathVariable("id") Integer id){

        return beanUserMapper.selectId(id);

    }
    @RequestMapping("/get/name/{user_name}")
    public BeanUser getBeanUser(@PathVariable("user_name") String name){


        return beanUserMapper.selectName(name);

    }

    @RequestMapping("/get/password/{user_name,pass_word}")
    public BeanUser getBeauser(@PathVariable("user_name") String name, @PathVariable("pass_word") String password){


        return beanUserMapper.verify(name, password);

    }


    //插入

    @RequestMapping("/insert")

    public BeanUser insertBeanUser(BeanUser beanUser){

        beanUserMapper.insertUser(beanUser);

        return beanUser;

    }
    //修改

    @RequestMapping("/update")

    public BeanUser updateBeanUser(BeanUser beanUser){

        beanUserMapper.UpdateBean(beanUser);

        return beanUser;

    }
    //删除

    @RequestMapping("/delete/{id}")

    public String deleteBeanUser(@PathVariable("id")Integer id){

        beanUserMapper.deleteId(id);

        return "删除成功！";

    }

    public static void main(String[]  args){

    }
}