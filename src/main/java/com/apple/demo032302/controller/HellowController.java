package com.apple.demo032302.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/spring")
public class HellowController {
    @Autowired
    @RequestMapping(value = "/hellow",method = RequestMethod.GET)
    public String say(){
        return "abcd";
    }

    @GetMapping("index")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView();
        Map<String, String> map = new HashMap<>();
        map.put("1", "张三");
        map.put("2", "李四");
        map.put("3","王五");
        model.addObject("user",map);
        model.setViewName("index");
        return model;
    }
}

