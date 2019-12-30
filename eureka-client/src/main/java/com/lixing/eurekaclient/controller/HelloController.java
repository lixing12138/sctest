package com.lixing.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;
    @GetMapping("/hello")
    public String hello(@RequestParam(required = true)String name){
        return "hello " + name + port;
    }

    @GetMapping("/")
    public String test(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://www.baidu.com/", String.class);
    }
}
