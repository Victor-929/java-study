package com.itheima;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest//SpringBoot单元测试的注解 - 当前测试类中的测试方法运行时，会启动springboot项目 - IOC容器
class SpringbootMybatisQuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testFindAll() {
        List<User> userList =  userMapper.findAll();
        userList.forEach(System.out::println);
    }
    /**
     * 测试删除用户
     *
     */
    @Test
    public void testDeleteById() {
       Integer i = userMapper.deleteById(4);
       System.out.println("影响的记录数：" + i);
    }
    /**
     * 测试添加用户
     */
    @Test
    public void testInsert() {
        User user = new User();
        user.setId(null);
        user.setUsername("gaoyuanyuan");
        user.setPassword("123456");
        user.setName("高圆圆");
        user.setAge(18);
        userMapper.insert(user);
    }
    /**
     * 测试修改用户
     */
    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(1);
        user.setUsername("zhouyu");
        user.setPassword("123456");
        user.setName("周瑜");
        user.setAge(18);
        userMapper.update(user);
    }

    /**
     * 测试根据用户名和密码查询用户
     */
    @Test
    public void testFindByUsernameAndPassword() {
        User user = userMapper.findByUsernameAndPassword("zhouyu", "123456");
        System.out.println(user);
    }
}
