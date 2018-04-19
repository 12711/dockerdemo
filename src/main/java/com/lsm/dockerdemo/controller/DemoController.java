package com.lsm.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/v1")
public class DemoController {
    @GetMapping(value = "/test/{name}")
    public Map get(@PathVariable("name") String name){
        System.out.println("hello," + name + " welcome");
        Map res = new HashMap();
        res.put("code","200");
        res.put("msg","ok");
        return res;
    }
}
