package com.example.curd.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = "/test")
public class test {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String test(){
        Map<String,String> map=new HashMap<String, String>();
        map.put("userName","lixiaole");
        map.put("userAge","20");
        return map.toString();
    }
}
