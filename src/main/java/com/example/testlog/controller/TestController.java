package com.example.testlog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuekangle
 * @date 2019-06-10 10:35
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @RequestMapping("/test1")
    public String test1(){
        log.info("this is a test" + System.currentTimeMillis());
        System.out.println("this is a test " + System.currentTimeMillis());
        return "this is a test!";
    }
}
