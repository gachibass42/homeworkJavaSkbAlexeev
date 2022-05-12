package com.example.homework.Listeners;

import org.springframework.scheduling.annotation.Async;
import com.example.homework.Events.AsyncE;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class AsyncL {
    @Async
    @EventListener
    public void listenAsyncEvent(AsyncE event) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Async event in thread - " + Thread.currentThread().getName());
    }
}
