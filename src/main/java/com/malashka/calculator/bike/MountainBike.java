package com.malashka.calculator.bike;

public class MountainBike extends Bike {

    public MountainBike(Integer wheelNumber, String seatMaterial, Integer maxSpeed) {
        super(wheelNumber, seatMaterial, maxSpeed);
    }

    @Override
    public void produceFrame() { System.out.println("- Варим укрепленную раму"); }

    @Override
    public void addRudder() {
        System.out.println("- Привариваем к раме укрепленный руль");
    }

    @Override
    public void addWheels() {
        System.out.println("- Крепим " + getWheelNumber() + " колеса");
    }

}
