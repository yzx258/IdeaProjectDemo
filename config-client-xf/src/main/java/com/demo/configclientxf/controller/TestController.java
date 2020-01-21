package com.demo.configclientxf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yucw
 * @date 2020/1/21 12:00
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${hello.text}")
    private String text;

    @GetMapping("/say")
    public String sayHello(){
        return text;
    }
}
