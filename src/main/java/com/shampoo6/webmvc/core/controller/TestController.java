package com.shampoo6.webmvc.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/1")
    public Object test1() {
        System.out.println("test1 be called");
        return null;
    }

}
