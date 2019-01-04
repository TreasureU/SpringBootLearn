package com.example.demo.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlogProperties {
    @Value("${com.example.blog.name}")
    private String name;
    
    @Value("${com.example.blog.title}")
    private String title;
    
    @Value("${com.example.blog.desc}")
    private String desc;
    
    @Value("${com.example.random.value}")
    private String randomValue;
    
    @Value("${com.example.random.int}")
    private int randomint;
    
    @Value("${com.example.random.test1}")
    private int randomTest1;
    
    @Value("${com.example.random.test2}")
    private int randomTest2;
    
    public String getRandomValue() {
        return randomValue;
    }
    
    public void setRandomValue(String randomValue) {
        this.randomValue = randomValue;
    }
    
    public int getRandomint() {
        return randomint;
    }
    
    public void setRandomint(int randomint) {
        this.randomint = randomint;
    }
    
    public int getRandomTest1() {
        return randomTest1;
    }
    
    public void setRandomTest1(int randomTest1) {
        this.randomTest1 = randomTest1;
    }
    
    public int getRandomTest2() {
        return randomTest2;
    }
    
    public void setRandomTest2(int randomTest2) {
        this.randomTest2 = randomTest2;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
