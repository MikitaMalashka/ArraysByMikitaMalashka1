package com.malashka.calculator.bike;

public class SmallChildrenBike extends ChildrenBike {
    Integer additionalWheels;

    public SmallChildrenBike(Integer wheelNumber, String seatMaterial, Integer maxSpeed, boolean bikeBell,
                             Integer additionalWheels) {
        super(wheelNumber, seatMaterial, maxSpeed, bikeBell);
        this.additionalWheels = additionalWheels;
    }

    public void addAdditionalWheels() {
        System.out.println("- Добавляем дополнительные колеса");
    }
}
