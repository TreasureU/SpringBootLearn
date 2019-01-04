package com.example.demo.JDBC;

/**
 *  mysql数据类型与java数据类型映射表： https://www.cnblogs.com/jerrylz/p/5814460.html
 */
public interface UserService {
    
    /**
     * 新增一个用户
     * @param name
     * @param age
     */
    void create(String name, Integer age);
    
    /**
     * 根据name删除一个用户高
     * @param name
     */
    void deleteByName(String name);
    
    /**
     * 获取用户总量
     */
    Integer getAllUsers();
    
    /**
     * 删除所有用户
     */
    void deleteAllUsers();
    
}
