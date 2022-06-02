package com.malashka.calculator.bike;

public class SmallChildrenBike extends ChildrenBike {
    Integer wheelDiameter;
    boolean stickers;

    public SmallChildrenBike(Integer wheelNumber, String seatMaterial, Integer maxSpeed) {
        super(wheelNumber, seatMaterial, maxSpeed);
    }

    public void setWheelDiameter(Integer wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public void setStickers(boolean stickers) {
        this.stickers = stickers;
    }
}
