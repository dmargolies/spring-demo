package com.example.demo;

public class Greeting {
    private String firstName;
    private String lastName;
    public Greeting(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName =lastName;
    }

    public String getFullGreeting() {
        return String.format("Hello %s %s", firstName, lastName);
    }

    public String getShortGreeting() {
        return String.format("Hello %s", firstName);
    }
}
