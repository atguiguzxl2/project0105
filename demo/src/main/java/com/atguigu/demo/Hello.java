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
    
    
    @RequestMapping("hello33")
    @ResponseBody
    public String sayHello33(){
        return "Hello 33";
    }

    @RequestMapping("hello333")
    @ResponseBody
    public String sayHello333(){
        return "Hello 333";
    }

    @RequestMapping("hello334")
    @ResponseBody
    public String sayHello334(){
        return "Hello 334";
    }
    
      @RequestMapping("xixi111")
    @ResponseBody
    public String xiXiXi11(){
        return "xiXiXi11";
    }

 @RequestMapping("haah111")
    @ResponseBody
    public String haha11(){
        return "hahaha11";
    }

}
