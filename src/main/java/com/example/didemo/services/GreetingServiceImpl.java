package com.example.didemo.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_MESSAGE = "Hello All";
    @Override
    public String sayGreetings() {
        return HELLO_MESSAGE;
    }
}
