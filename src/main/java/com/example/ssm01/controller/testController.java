package com.example.ssm01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class testController {
    @GetMapping("/hello")
    public String method1(){
        return "hi！！！";
        //这里添加一行注释 pull下来
        //之后进行添加
        //新的内容进行添加 tylerlli 进行修改
        //添加新的修改
        //更换用户添加新的修改

    }
}
