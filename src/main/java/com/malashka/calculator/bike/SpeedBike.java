package com.malashka.calculator.bike;

public class SpeedBike extends Bike {

    public SpeedBike(int wheelNumber, String seatMaterial, String rudderFunction, String frameColor, int maxSpeed) {
        super(wheelNumber, seatMaterial, rudderFunction, frameColor, maxSpeed);
    }

    Bike speedBike = new Bike(2, "кожзам", "регулятор скорости, спидометр",
            "красный", 40);
    int speedWheel = speedBike.getWheelNumber();
    String speedSeat = speedBike.getSeatMaterial();
    String speedRudder = speedBike.getRudderFunction();
    String speedFrame = speedBike.getFrameColor();
    int speedSpeed = speedBike.getMaxSpeed();

    public void getSpeedBikeInfo() {
        produceBike();
        System.out.println("Количество колес: " + speedWheel);
        System.out.println("Материал сидения: " + speedSeat);
        System.out.println("Дополнительные функции, представленные на руле: " + speedRudder);
        System.out.println("Цвет рамы: " + speedFrame);
        System.out.println("Максимальная скорость до облегчения рамы: " + speedSpeed + " км/ч");
        speedBike.setMaxSpeed(45);
        System.out.println("Максимальная скорость после облегчения рамы: " + speedSpeed + " км/ч\n");
    }
}
