package com.example.demo.controller;

import com.example.demo.bean.BeanUser;

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
        System.out.println(id);
        System.out.println(beanUserMapper.selectId(id));

        return beanUserMapper.selectId(id);

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
        ControllerBean a = new ControllerBean();
        a.getBeanUser(1);
    }
}