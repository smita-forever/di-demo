package com.example.didemo.controllers;

import com.example.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;
    @Before
    public void setup() throws Exception{
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }
    @Test
    public void test() throws Exception {
        Assert.assertEquals(GreetingServiceImpl.HELLO_MESSAGE, constructorInjectedController.sayHello());
    }

}

