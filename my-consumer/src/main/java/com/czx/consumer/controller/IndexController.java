package com.czx.consumer.controller;

import com.czx.consumer.service.IndexInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by czx on 2018/4/10.
 */
@RestController
public class IndexController {

    @Autowired
    IndexInterface indexInterface;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return indexInterface.hello(name);
    }
}
