package com.example.java10;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class KnightsTest {

    @Autowired
    public void KnightsTest(List<Knight> knights) {
        this.knights = knights;
    }

    List<Knight> knights;


    @Test
    public void run(){
        for (Knight k:
                knights) {
            k.fight();
        }
    }
}
