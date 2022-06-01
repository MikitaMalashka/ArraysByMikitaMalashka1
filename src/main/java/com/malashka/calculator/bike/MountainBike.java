package com.malashka.calculator.bike;

import java.util.Objects;

public class MountainBike extends Bike {

    public MountainBike(int wheelNumber, String seatMaterial, String rudderFunction, String frameColor, int maxSpeed) {
        super(wheelNumber, seatMaterial, rudderFunction, frameColor, maxSpeed);
    }

    Bike mountainBike = new Bike(2, "кожаное", "регулятор скорости",
            "черный", 30);
    int mountainWheel = mountainBike.getWheelNumber();
    String mountainSeat = mountainBike.getSeatMaterial();
    String mountainRudder = mountainBike.getRudderFunction();
    String mountainFrame = mountainBike.getFrameColor();
    int mountainSpeed = mountainBike.getMaxSpeed();

    public void getMountainBikeInfo() {
        produceBike();
        System.out.println("Количество колес: " + mountainWheel);
        System.out.println("Материал сидения: " + mountainSeat);
        System.out.println("Дополнительные функции, представленные на руле: " + mountainRudder);
        System.out.println("Цвет рамы: " + mountainFrame);
        System.out.println("Максимальная скорость: " + mountainSpeed + " км/ч\n");
    }
}
