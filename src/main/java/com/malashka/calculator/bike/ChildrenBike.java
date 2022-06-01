package com.malashka.calculator.bike;

public class ChildrenBike extends Bike {

    public ChildrenBike(int wheelNumber, String seatMaterial, String rudderFunction, String frameColor, int maxSpeed) {
        super(wheelNumber, seatMaterial, rudderFunction, frameColor, maxSpeed);
    }

    Bike childrenBike = new Bike(2, "кожаное",
            "регулятор скорости, зеркала заднего вида", "розовый/синий", 20);
    int childrenWheel = childrenBike.getWheelNumber();
    String childrenSeat = childrenBike.getSeatMaterial();
    String childrenRudder = childrenBike.getRudderFunction();
    String childrenFrame = childrenBike.getFrameColor();
    int childrenSpeed = childrenBike.getMaxSpeed();

    public void getChildrenBikeInfo() {
        produceBike();
        System.out.println("Количество колес: " + childrenWheel);
        System.out.println("Материал сидения: " + childrenSeat);
        System.out.println("Дополнительные функции, представленные на руле: " + childrenRudder);
        System.out.println("Цвет рамы: " + childrenFrame);
        System.out.println("Максимальная скорость: " + childrenSpeed + " км/ч\n");
    }
}
