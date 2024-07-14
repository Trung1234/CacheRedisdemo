package com.example.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MyService;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/data/{id}")
    public String getData(@PathVariable Long id) {
        return myService.getData(id);
    }
}