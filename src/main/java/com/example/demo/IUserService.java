package com.example.demo;

/**
 * No using for this project! just for practicing the database manipulate!
 * user的service
 */
public interface IUserService {
    /**
     *
     * @param name the name of the client
     * @param passwords the password of the client
     * @param email the email of the client
     */
    int create(String name, String passwords, String email);

    /**
     * 根据用户名删除用户
     * @param name the name of the client
     */
    void deleteByName(String name);

    /**
     * 获取用户总数
     * @return the users number
     */
    Integer getUsersCount();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();
}
