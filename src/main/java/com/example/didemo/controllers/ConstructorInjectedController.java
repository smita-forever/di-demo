package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;

public class ConstructorInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
