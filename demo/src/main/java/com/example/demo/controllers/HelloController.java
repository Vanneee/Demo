package com.example.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    //@PostMapping
    @GetMapping("hello")
    public String sayHello(Model model){
        String name = "SD17321";
        model.addAttribute("name", name);
        return "hello";
    }
}
