package com.example.demo.errorHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    public static final String DEFAULT_ERROR_VIEW = "error/5xx";
    
    // 此处可以支持匹配不同的类
    @ExceptionHandler( value = Exception.class )
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception{
        ModelAndView mav = new ModelAndView();
        mav.addObject( "exception", e );
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        
        return mav;
    }

}
