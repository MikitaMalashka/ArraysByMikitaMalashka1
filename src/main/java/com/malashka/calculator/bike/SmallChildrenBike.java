package com.malashka.calculator.bike;

public class SmallChildrenBike extends ChildrenBike {

    public SmallChildrenBike(int wheelNumber, String seatMaterial, String rudderFunction, String frameColor, int maxSpeed) {
        super(wheelNumber, seatMaterial, rudderFunction, frameColor, maxSpeed);
    }

    public void getSmallChildrenBikeInfo() {
        getChildrenBikeInfo();
        System.out.println("\b" + "Добавляем 2 колеса для устойчивости\n");
    }
}
