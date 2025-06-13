package com.itheima.dao;

import java.util.List;

public interface UserDao {
    /**
     * 加载用户的方法
     */
    public List<String> findAll();
}
