package com.example.demo.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 
    @RequestMapping("/")
    String home(ModelMap modal) {
        return "Hello World";
    }
}