package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Injected via Constructor Greeting Service";
    }
}
