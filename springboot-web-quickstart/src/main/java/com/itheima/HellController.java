package com.itheima;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//当前类是一个请求处理类
public class HellController {
    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println("name：" + name);
        return "hello" + name + "~";
    }
}
