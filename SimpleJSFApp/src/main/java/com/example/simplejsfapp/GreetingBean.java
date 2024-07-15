package com.example.simplejsfapp;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class GreetingBean {
    private String name;
    private String greetingMessage;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    // Action method
    public String greet() {
        this.greetingMessage = "Hola, " + name + "!";
        return null; // Stay on the same page
    }
}
