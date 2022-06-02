package com.malashka.calculator.bike;

public class ChildrenBike extends Bike {
    public boolean bikeBell;

    public ChildrenBike(Integer wheelNumber, String seatMaterial, Integer maxSpeed, boolean bikeBell) {
        super(wheelNumber, seatMaterial, maxSpeed);
        this.bikeBell = bikeBell;
    }

    @Override
    public void produceFrame() {
        System.out.println("- Варим детскую розовую/синюю раму");
    }

    @Override
    public void addRudder() {
        System.out.println("- Привариваем детский руль с колокольчиком");
    }

    @Override
    public void addWheels() {
        System.out.println("- Крепим " + getWheelNumber() + " колеса");
    }
}
