package com.malashka.calculator.bike;

public class Bike {
    private Integer wheelNumber;
    private String seatMaterial;
    private Integer maxSpeed;

    public Bike(Integer wheelNumber, String seatMaterial, Integer maxSpeed) {
        this.wheelNumber = wheelNumber;
        this.seatMaterial = seatMaterial;
        this.maxSpeed = maxSpeed;
    }

    public void produceFrame() {
        System.out.println("- Варим велосипедную раму");
    }
    public void addRudder() {
        System.out.println("- Привариваем к раме велосипедный руль");
    }
    public void addWheels() {
        System.out.println("- Приделываем к велосипеду колеса");
    }

    public int getWheelNumber() { return wheelNumber; }

    public void setWheelNumber(Integer wheelNumber) { this.wheelNumber = wheelNumber; }

    public String getSeatMaterial() { return seatMaterial; }

    public void setSeatMaterial(String seatMaterial) { this.seatMaterial = seatMaterial; }

    public int getMaxSpeed() { return maxSpeed; }

    public void setMaxSpeed(Integer maxSpeed) { this.maxSpeed = maxSpeed; }

}
