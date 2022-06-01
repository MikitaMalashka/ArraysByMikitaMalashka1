package com.malashka.calculator.testOOP;

public class PersianCat extends Cat{

    public PersianCat(String name, Integer weight, Integer height) {
        super(name, weight, height);
    }

    @Override
    public void lovesPerson() {
        System.out.println("Никого не люблю");
    }
}
