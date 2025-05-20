package org.example.creational.demo;

import org.example.creational.demo.builder.Dragon;

public class Main {

    public static void main(String[] args) {
    Dragon dragon1 = new Dragon.Builder().age(10).name("toto").maitre("Nel").build();
        System.out.println(dragon1);
    }
}
