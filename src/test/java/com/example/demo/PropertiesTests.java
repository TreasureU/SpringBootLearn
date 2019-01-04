package com.example.demo;

import com.example.demo.Properties.BlogProperties;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTests {
    
    @Autowired
    private BlogProperties blog;
    
    @Before
    public void setUp() throws Exception {
    
    }
    
    @Test
    public void getProperties() throws Exception {
        Assert.assertEquals( "健康哥哥", blog.getName());
        Assert.assertEquals("健康哥哥的小屋", blog.getTitle());
        Assert.assertEquals("健康哥哥正在 努力写《健康哥哥的小屋》", blog.getDesc());
        
        System.out.println( blog.getRandomValue() );
        System.out.println( blog.getRandomint() );
        System.out.println( blog.getRandomTest1() );
        System.out.println( blog.getRandomTest2() );
    }
    
}
