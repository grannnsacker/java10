package com.example.java10;


import org.springframework.stereotype.Component;

@Component
public class StrongKnight implements Knight{
    public void fight(){
        System.out.println("Strong");
    }
}
