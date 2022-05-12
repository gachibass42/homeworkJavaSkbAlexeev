package com.example.homework;

import com.example.homework.Events.AsyncE;
import com.example.homework.Events.SyncE;
import com.example.homework.Events.TransactionE;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@ConstructorBinding
public class Controller {
    private ApplicationEventPublisher controller;

    public Controller(ApplicationEventPublisher publisher) {
        this.controller = publisher;
    }


    public void TriggerOnTransactionalEvent() {
        controller.publishEvent(new TransactionE(this));
    }

    public void TriggerOnSyncEvent() {
        controller.publishEvent(new SyncE(this));
    }

    public void TriggerOnAsyncEvent() {
        controller.publishEvent(new AsyncE(this));
    }
}
