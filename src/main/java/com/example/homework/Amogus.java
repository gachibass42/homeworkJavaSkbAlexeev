package com.example.homework;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Amogus implements IAbobus{

    @Override
    public String sus(){
        return "Amogus";
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("pum pum pum pum (неугрожающе)");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("No Sus");
    }
}
