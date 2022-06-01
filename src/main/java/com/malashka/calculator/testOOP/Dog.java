package com.malashka.calculator.testOOP;

public class Dog extends Essence{

    public Dog(String name, Integer weight, Integer height) {
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

    public void barks(){
        System.out.println("гав");
    }
}
