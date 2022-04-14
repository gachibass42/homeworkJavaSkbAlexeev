package com.example.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bruh {
    public IAbobus one;
    public IAbobus two;
    @Autowired Aboba abo; //внедрение через поле
    public Aboba ba;

    @Autowired
    public void setBoba(Aboba boba) { //внедрениче через конструктор
        ba = boba;
        System.out.println("Боба успешно забобена через конструктор");
    }


    public Bruh(){
        one = new Amogus();
        two = new IsSus();
        setBoba(new Aboba());
        abo = new Aboba();
    }

    public void Brun(){
        one.sus();
        two.sus();
        abo.Aboboba();
        ba.Aboboba();
    }
}
