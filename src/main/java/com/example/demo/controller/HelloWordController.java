package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhumingfang on 2018/4/18.
 */
@RestController
@RequestMapping
public class HelloWordController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "Hello word";
    }



}
