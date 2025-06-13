package com.itheima.pojo;

import java.time.LocalDateTime;

/**
 * 用户信息
 */
public class User {

    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;
    private LocalDateTime updateTime;

    // Constructors...

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public User(Integer id, String username, String password, String name, Integer age, LocalDateTime updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.updateTime = updateTime;
    }

}


