package com.malashka.calculator.bike;

public class ChildrenBike extends Bike {

    public ChildrenBike(Integer wheelNumber, String seatMaterial, Integer maxSpeed) {
        super(wheelNumber, seatMaterial, maxSpeed);
    }

    @Override
    public void produceFrame() { System.out.println("- Варим детскую велосипедную раму"); }

}
