package com.example.homework.Events;

import org.springframework.context.ApplicationEvent;

public class SyncE extends ApplicationEvent {
    public SyncE(Object source) {
        super(source);
        System.out.println("Sync event created");
    }
}