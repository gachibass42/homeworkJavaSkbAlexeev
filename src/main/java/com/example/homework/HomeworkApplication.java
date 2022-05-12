package com.example.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class HomeworkApplication {
    private static Controller controller;

    public HomeworkApplication(Controller controller) {
        HomeworkApplication.controller = controller;
    }

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
        controller.TriggerOnAsyncEvent();
        controller.TriggerOnSyncEvent();
        controller.TriggerOnTransactionalEvent();
    }
}
