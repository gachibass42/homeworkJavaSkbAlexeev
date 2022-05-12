package com.example.homework.Events;

import org.springframework.context.ApplicationEvent;

public class TransactionE extends ApplicationEvent {

    public TransactionE(Object source) {
        super(source);
        System.out.println("Transition event created");
    }
}
