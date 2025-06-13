package com.itheima;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ResponseController {

    /**
     * 方式一：HttpServletResponse 设置响应数据
     * @param response
     * @throws IOException
     */
    @RequestMapping("/response")
    public void response(HttpServletResponse  response) throws IOException {
        //1、设置响应状态码
            response.setStatus(HttpServletResponse.SC_OK);
        //2、设置响应头
            response.setHeader("name","itheima");
        //3、设置响应体
            response.getWriter().write("<h1>hello,springboot</h1>");

    }

    /**
     * 方式二：ResponseEntity 封装响应数据 Spring提供的方式
     * @return
     */
    @RequestMapping("/response2")
    public ResponseEntity<String> response2(){
        return ResponseEntity
                .status(401)
                .header("name","javaWeb-Ai")
                .body("<h1>hello,springboot</h1>");
    }
}
