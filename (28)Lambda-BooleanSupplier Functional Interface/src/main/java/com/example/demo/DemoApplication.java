package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.BooleanSupplier;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        BooleanSupplier bs = ()->true;
        System.out.println(bs.getAsBoolean());

        int x = 100;
        int y = 70;

        bs =()->x>y;
        System.out.println(bs.getAsBoolean());

    }
}
