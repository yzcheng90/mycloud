package com.czx.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by czx on 2018/4/10.
 */
@RestController
public class IndexController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，这是一条新的信息";
    }
}
