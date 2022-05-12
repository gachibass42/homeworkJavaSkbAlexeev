package com.example.homework.Events;

import org.springframework.context.ApplicationEvent;

public class AsyncE extends ApplicationEvent {
    public AsyncE(Object source) {
        super(source);
        System.out.println("Async event created");
    }
}
