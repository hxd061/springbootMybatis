package com.apple.demo032302.controller;

import com.apple.demo032302.entity.User;
import com.apple.demo032302.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

import java.util.List;



@RestController

public class UserController {



    @Resource

    private UserService userService;



    //根据id查询用户信息

    @GetMapping("/user/{id}")

    public User findById(@PathVariable("id") int id){

        return userService.findById(id);

    }



    //查询所有用户信息

    @GetMapping("/user/list")

    public List<User> findAll(){

        return userService.findAll();

    }

}
