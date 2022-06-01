package com.malashka.calculator.testOOP;

public class BritishСat extends Cat{

    public BritishСat(String name, Integer weight, Integer height) {
        super(name, weight, height);
    }

    @Override
    public void lovesPerson() {
        System.out.println("люблю малашку");
    }
}
