package com.itheima;

import org.junit.Test;

/**
 * 测试类
 */
public class UserServiceTest {
    @Test
    public void testGetAge(){
        UserService userService = new UserService();
        Integer age = userService.getAge("1000000020000");
        System.out.println(age);
    }
}
