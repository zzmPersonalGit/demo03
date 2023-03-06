package com.example.demo03.controller;

import com.example.demo03.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Person person;

    @RequestMapping("/persion")
    public Person person(){
        return person;
    }
}
