package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/03/28
 */
@RestController
public class Test {
    @RequestMapping("/")
    public String test() {
        return "gg";
    }
}
