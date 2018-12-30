package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {


    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }

    //    @Autowired - Constructor based autowiring is optional.
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
