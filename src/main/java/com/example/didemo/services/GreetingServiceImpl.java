package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_MESSAGE = "Hello All - Original";
    @Override
    public String sayGreetings() {
        return HELLO_MESSAGE;
    }
}
