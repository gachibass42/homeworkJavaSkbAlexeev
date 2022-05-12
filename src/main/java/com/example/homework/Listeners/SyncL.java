package com.example.homework.Listeners;

import com.example.homework.Events.SyncE;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class SyncL {
    @EventListener
    public void listenMessageEvent(SyncE event) {
        System.out.println("Sync event in thread - " + Thread.currentThread().getName());
    }
}
