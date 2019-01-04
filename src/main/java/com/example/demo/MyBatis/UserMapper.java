package com.example.demo.MyBatis;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    
    @Select("SELECT * FROM user WHERE NAME = #{name}")
    List<User> findByName(@Param("name") String name);
    
    @Insert("INSERT INTO user(NAME,AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}
