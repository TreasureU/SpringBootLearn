package com.example.demo.errorHandler;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class BaseErrorController implements ErrorController {
    
    /**
     * 用于拦截url出错导致的异常，即常见的 404 错误
     * @return
     */
    @Override
    public String getErrorPath(){
        return "error/4xx";
    }
    
    /**
     * 这个是作为普通的 web拦截器，针对想要主动访问错误页面的，导航到相应页面处理
     * @return
     */
    @RequestMapping
    public String error(){
        return getErrorPath();
    }
    
}
