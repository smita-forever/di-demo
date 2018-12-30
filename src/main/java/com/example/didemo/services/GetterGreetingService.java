package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Injected via Getter Greeting Service";
    }
}
