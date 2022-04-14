package com.example.homework;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Aboba {

    public Aboba(){
    }

    public String Aboboba(){
        return "abobus";
    }

    @PostConstruct
    public void PostConstruct(){
        System.out.println("Yesboba)");
    }

    @PreDestroy
    public void PreDestroy(){
        System.out.println("Noboba(");
    }
}
