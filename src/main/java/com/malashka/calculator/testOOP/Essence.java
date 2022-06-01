package com.malashka.calculator.testOOP;

public abstract class Essence {
    private String name;
    private Integer weight;
    private Integer height;

    public Essence(String name, Integer weight, Integer height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public abstract void walk();
    public abstract void jump();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }


}