package com.malashka.calculator.testOOP;

public class Cat extends Essence{
    public Cat(String name, Integer weight, Integer height) {
        super(name, weight, height);
    }

    @Override
    public void walk() {
        System.out.println("идет");
    }

    @Override
    public void jump() {
        System.out.println("прыгает");
    }

    public void meows(){
        System.out.println("мяяу");
    }

    public void lovesPerson(){
        System.out.println("любллю человека");
    }
}
