package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping("/showForm")
    public String showform(){
        return "helloWorld-form";
    }
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
}
