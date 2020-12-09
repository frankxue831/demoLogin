package com.example.demo.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerBeanTest {
    ControllerBean a = new ControllerBean();

    @Test
    public void getBeanUser() {
        System.out.println(a.getBeanUser(1));
    }

    @Test
    public void testGetBeanUser() {
        System.out.println(1);
    }

    @Test
    public void insertBeanUser() {
    }

    @Test
    public void updateBeanUser() {
    }

    @Test
    public void deleteBeanUser() {
    }
}