package com.example.demo.bean;

public class BeanUser {

    private Integer id;
    private String user_name;
    private String pass_word;
    private String E_mail;

    public Integer getId() {

        return id;

    }

    public void setId(Integer id) {

        this.id = id;

    }

    public String getUser_name() {

        return user_name;

    }

    public void setUser_name(String user_name) {

        this.user_name = user_name;

    }

    public String getPass_word() {

        return pass_word;

    }

    public void setPass_word(String pass_word) {

        this.pass_word = pass_word;

    }

    public void setE_mail(String email) {
        this.E_mail = email;
    }

    public String getE_mail(){
        return E_mail;
    }
}
