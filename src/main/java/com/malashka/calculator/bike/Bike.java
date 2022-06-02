package com.malashka.calculator.bike;

public abstract class Bike {
    private Integer wheelNumber;
    private String seatMaterial;
    private Integer maxSpeed;

    public Bike(Integer wheelNumber, String seatMaterial, Integer maxSpeed) {
        this.wheelNumber = wheelNumber;
        this.seatMaterial = seatMaterial;
        this.maxSpeed = maxSpeed;
    }

    public abstract void produceFrame();
    public abstract void addRudder();
    public abstract void addWheels();

    public int getWheelNumber() { return wheelNumber; }

    public void setWheelNumber(Integer wheelNumber) { this.wheelNumber = wheelNumber; }

    public String getSeatMaterial() { return seatMaterial; }

    public void setSeatMaterial(String seatMaterial) { this.seatMaterial = seatMaterial; }

    public int getMaxSpeed() { return maxSpeed; }

    public void setMaxSpeed(Integer maxSpeed) { this.maxSpeed = maxSpeed; }

}
