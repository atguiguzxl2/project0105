package com.atguigu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

    @RequestMapping("hello")
    @ResponseBody
    public String sayHello(){

        return "Hello springbott IDEA!";
    }
    
    @RequestMapping("hello1")
    @ResponseBody
    public String sayHello2(){
        return "Hello 2";
    }


    @RequestMapping("hello3")
    @ResponseBody
    public String sayHello3(){
        return "hello3";
    }
    
}
