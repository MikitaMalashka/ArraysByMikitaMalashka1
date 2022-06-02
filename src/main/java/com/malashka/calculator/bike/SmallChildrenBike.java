package com.malashka.calculator.bike;

public class SmallChildrenBike extends ChildrenBike {

    public SmallChildrenBike(Integer wheelNumber, String seatMaterial, Integer maxSpeed) {
        super(wheelNumber, seatMaterial, maxSpeed);
    }

    @Override
    public void produceFrame() { System.out.println("- Варим укрепленную разноцветную раму");}

}
