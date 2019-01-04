package com.example.demo;

import com.example.demo.MyBatis.User;
import com.example.demo.MyBatis.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisTest {
    
    @Autowired
    private UserMapper userMapper;
    
    @Test
    @Rollback
    public void findByName() throws Exception{
        userMapper.insert("AAA", 20);
        List<User> userList = userMapper.findByName("AAA");
        Assert.assertTrue( userList.size() > 0 );
        Assert.assertEquals(20, userList.get(0).getAge().intValue());
    }
    
}
