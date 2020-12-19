package com.example.demo;

/*
 * No using for this project! just for practicing the database manipulate!
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;//Spring的JdbcTemplate是自动配置的，可直接使用

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
        @Override
    public int create(String name, String passwords, String email) {
        return jdbcTemplate.update("insert into USERLIST(USERNAME, PASSWORDS, EMAIL) values(?, ?, ?)",
                name, passwords, email);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from USERLIST where USERNAME = ?", name);
    }

    @Override
    public Integer getUsersCount() {
        return jdbcTemplate.queryForObject("select count(1) from USERLIST", Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("delete from USERLIST");
    }

    public static void main(String[]  args){
        UserServiceImpl a = new UserServiceImpl();
        a.deleteByName("bob");

    }
}


