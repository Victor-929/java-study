package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

//@Component
@Service
//@Primary
public class UserServiceImpl2 implements UserService {

    @Autowired//应用程序运行时，会自动的查询该类型的bean对象，并赋值给该成员变量
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        //1、调用dao层方法，获取用户数据
        List<String> lines = userDao.findAll();
        //2、解析用户信息，封装为User对象 -> list集合
        List<User> userList =  lines.stream().map(line ->{
            String[] psrts = line.split(",");
            Integer id = Integer.parseInt(psrts[0]);
            String username = psrts[1];
            String password = psrts[2];
            String name = psrts[3];
            Integer age = Integer.parseInt(psrts[4]);
            LocalDateTime updateTime = LocalDateTime.parse(psrts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id + 200,username,password,name,age,updateTime);
        }).toList();

        return  userList;
    }
}
