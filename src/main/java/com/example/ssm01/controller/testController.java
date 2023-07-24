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
        //18进行修改 main添加

    }
}
