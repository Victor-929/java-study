package com.itheima;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource; // ✅ 添加此 import

import static org.junit.jupiter.api.Assertions.*;

/**
 * 测试类
 */
@DisplayName("用户服务测试类")
public class UserServiceTest {
    @Test
    public void testGetAge(){
        UserService  userService = new UserService();
        Integer age = userService.getAge("10100000024343030");
        System.out.println(age);
    }

    @Test
    public void testGetGender(){
        UserService  userService = new UserService();
        String gender = userService.getGender("10100000024343030");
        System.out.println(gender);
    }

    @Test
    public void testGenderWithAssert(){
        UserService  userService = new UserService();
        String gender = userService.getGender("10100000024343030");
        assertEquals("女", gender, "性别获取有误！");
    }

    @Test
    public void testGenderWithAssert2() {
        UserService userService = new UserService();
        assertThrows(NullPointerException.class, () -> {
            userService.getGender(null);
        });
    }

    /**
     * 参数化测试
     */
    @DisplayName("测试获取性别")
    @ParameterizedTest
    @ValueSource(strings = {"10100000024343030","10100000024343031"})
    public void testGetGender2(String idCard) { // ✅ 添加参数接收值
        UserService userService = new UserService();
        String gender = userService.getGender(idCard);
        System.out.println("性别：" + gender);
        // 可选：添加断言验证结果
        assertEquals("男", gender, "性别获取有误！");
    }
}
