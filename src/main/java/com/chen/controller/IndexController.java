package com.chen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2017/7/4.
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String hello() {
        return "hello world ";
    }
}
