package com.example.demo.Redis.Lettuce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;

@Controller
public class TestController {
    
    @ResponseBody
    @RequestMapping("/testme")
    public String index(){
        
        String str = "";
        
        str += CacheProvider.set("tyh", "aaaaaaaaaaaaaaaaaa");
        str += "|";
        str += CacheProvider.get("tyh");
        str += "|";
        str += CacheProvider.del("tyh");
        
        str += "|||";
        
        Cookie cookie = new Cookie("aaa", "bbb");
        str += CacheProvider.set("cookie", cookie);
        str += "|";
        str += CacheProvider.get("cookie", Cookie.class);
        str += "|";
        str += CacheProvider.del("cookie");
        
        return str.toString();
    }
}