package com.itheima;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * UserService 类的单元测试类
 */
public class UserServiceAITest {

    private UserService userService;

    @BeforeEach
    public void setUp() {
        userService = new UserService();
    }

    @Test
    @DisplayName("测试 getAge 方法返回固定值 18 - 正常输入")
    public void testGetAge_WithValidNumber() {
        // Arrange
        String input = "1000000020000";

        // Act
        Integer result = userService.getAge(input);

        // Assert
        assertNotNull(result);
        assertEquals(18, result);
    }

    @Test
    @DisplayName("测试 getAge 方法返回固定值 18 - 输入为 null")
    public void testGetAge_WithNullInput() {
        // Arrange
        String input = null;

        // Act
        Integer result = userService.getAge(input);

        // Assert
        assertNotNull(result);
        assertEquals(18, result);
    }

    @Test
    @DisplayName("测试 getAge 方法返回固定值 18 - 输入为空字符串")
    public void testGetAge_WithEmptyString() {
        // Arrange
        String input = "";

        // Act
        Integer result = userService.getAge(input);

        // Assert
        assertNotNull(result);
        assertEquals(18, result);
    }

    @Test
    @DisplayName("测试 getAge 方法返回固定值 18 - 输入为非数字字符串")
    public void testGetAge_WithNonNumericString() {
        // Arrange
        String input = "abc123";

        // Act
        Integer result = userService.getAge(input);

        // Assert
        assertNotNull(result);
        assertEquals(18, result);
    }
}
