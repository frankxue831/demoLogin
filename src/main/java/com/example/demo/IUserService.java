package com.example.demo;

/**
 * user的service
 */
public interface IUserService {
    /**
     *
     * @param name
     * @param passwords
     * @param email
     */
    int create(String name, String passwords, String email);

    /**
     * 根据用户名删除用户
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取用户总数
     * @return
     */
    Integer getUsersCount();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();
}
