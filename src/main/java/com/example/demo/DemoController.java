package com.example.demo;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
    @QueryMapping
    public String greeting(@Argument String name) {
        return String.format("Hello %s", name);
    }

    @QueryMapping
    public Greeting fullGreeting(@Argument String firstName, @Argument String lastName) {
       return new Greeting(firstName, lastName);
    }
}