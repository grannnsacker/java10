package com.example.java10;

import org.springframework.stereotype.Component;

@Component
public class WeakKnight implements Knight{
    @Override
    public void fight() {
        System.out.println("weak(");
    }
}
