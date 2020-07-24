package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

    @RequestMapping("get")
    @ResponseBody
    public String get(){
        return "hello";
    }

    @RequestMapping("get1")
    @ResponseBody
    public String get1(){
        return "hello1";
    }
    
    @RequestMapping("get12")
    @ResponseBody
    public String get12(){
        return "hello12";
    }
}
