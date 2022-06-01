package com.malashka.calculator.bike;

public class Bike {
    private int wheelNumber;
    private String seatMaterial;
    private String rudderFunction;
    private String frameColor;
    private int maxSpeed;

    public Bike(int wheelNumber, String seatMaterial, String rudderFunction, String frameColor, int maxSpeed) {
        this.wheelNumber = wheelNumber;
        this.seatMaterial = seatMaterial;
        this.rudderFunction = rudderFunction;
        this.frameColor = frameColor;
        this.maxSpeed = maxSpeed;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public String getSeatMaterial() {
        return seatMaterial;
    }

    public void setSeatMaterial(String seatMaterial) {
        this.seatMaterial = seatMaterial;
    }

    public String getRudderFunction() {
        return rudderFunction;
    }

    public void setRudderFunction(String rudderFunction) {
        this.rudderFunction = rudderFunction;
    }

    public String getFrameColor() {
        return frameColor;
    }

    public void setFrameColor(String frameColor) {
        this.frameColor = frameColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void produceBike () {
        System.out.println("Отправляем в производство велосипед со следующими характеристиками: \n");
    }
}
