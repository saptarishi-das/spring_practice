package com.java.spring.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/helloworld")
    public String helloWorld() {
        System.out.println("running helloworld mapping");
        return "Hello World!! Everything here was coded from iPad Pro 11 inch 2021 model using gitpod and UCoW\n";
    }

    @RequestMapping("/sayhello")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + "!!";
    }
}
