package com.example.demo.controller;

import com.example.demo.entity.TUserEntity;
import com.example.demo.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhumingfang on 2018/4/19.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<TUserEntity> list(){
        return userJPA.findAll();
    }

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public TUserEntity save(TUserEntity entity){
        return userJPA.save(entity);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public List<TUserEntity> delete(long id){
        userJPA.deleteById(id);
        return userJPA.findAll();
    }
}
