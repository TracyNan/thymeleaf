package com.nan.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    private String index(){
        return "hello";
    }

    @GetMapping("/hello/http")
    private String httpTest(HttpServletRequest request){
        request.setAttribute("name","zhunan");
        return "hellohttp";
    }
}
