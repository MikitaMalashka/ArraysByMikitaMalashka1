package com.malashka.calculator.testOOP;

public class HomoSapiens extends Essence{
    boolean hands;
    boolean legs;

    public HomoSapiens(String name, Integer weight, Integer height, boolean hands, boolean legs) {
        super(name, weight, height);
        this.hands = hands;
        this.legs = legs;
    }

    @Override
    public void walk() {
        System.out.println("идет");
    }

    @Override
    public void jump() {
        System.out.println("прыгает");
    }
}
