package com.unish.simpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome xa hai";
    }

    @RequestMapping("/about")
    public String about(){
        return "ABOUT";
    }

}
