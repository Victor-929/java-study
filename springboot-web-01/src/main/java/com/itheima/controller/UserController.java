package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户信息的Controller
 */
@RestController//@ResponseBody -> 作用：将controller返回的数据直接作为响应体的数据直接响应；返回值是对象/结合->json->响应
public class UserController {
    /*@RequestMapping("/list")
    public List<User> list() throws Exception {
        //1、加载并读取user.txt文件，获取用户数据
        //InputStream in = new FileInputStream("E:\\MyDailyWork\\IDEA-Java\\java-study\\springboot-web-01\\src\\main\\resources\\user.txt")
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readLines(in,  StandardCharsets.UTF_8,  new ArrayList<>());

        //2、解析用户信息，封装为User对象 -> list集合
        List<User> userList =  lines.stream().map(line ->{
            String[] psrts = line.split(",");
            Integer id = Integer.parseInt(psrts[0]);
            String username = psrts[1];
            String password = psrts[2];
            String name = psrts[3];
            Integer age = Integer.parseInt(psrts[4]);
            LocalDateTime  updateTime = LocalDateTime.parse(psrts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id,username,password,name,age,updateTime);
        }).toList();

        //3、返回数据(json)
        return  userList;

    }*/

    @Autowired
    private UserService  userService;
    @RequestMapping("/list")
    public List<User> list() throws Exception {
        //1、调用service，获取数据
        List<User> userList = userService.findAll();

        //2、返回数据(json)
        return  userList;

    }
}
