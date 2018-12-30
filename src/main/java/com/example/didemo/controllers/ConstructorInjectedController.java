package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

//    @Autowired - Constructor based autowiring is optional.
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
