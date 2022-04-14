package com.example.homework;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class IsSus implements IAbobus{
    @Override
    public String sus(){
        return "Sus";
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("pum pum pum pum(угрожающе)");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("This Sus");
    }
}
