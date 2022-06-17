package com.eejaytaa.springboottutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//This is a particular controller
//This is as well a component
//Rest endpoints
@RestController
public class HelloController {

    //One option
//  @RequestMapping(value= "/", method = RequestMethod.GET)
    //Second option
    @GetMapping("/")
    public String helloWorld(){
        return "Hello";
    }

}
