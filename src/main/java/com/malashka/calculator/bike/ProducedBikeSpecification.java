package com.malashka.calculator.bike;

public class ProducedBikeSpecification {
    public static void main(String[] args) {
        System.out.println("Ход производства горного велосипеда: \n");
        MountainBike mountainBike = new MountainBike(2, "кожаное", 40);
        mountainBike.produceFrame();
        mountainBike.addRudder();
        mountainBike.addWheels();
        mountainBike.addDampers();
        System.out.println();
        System.out.println("Характеристики произведенного велосипеда: \n");
        System.out.println("Количество колес: " + mountainBike.getWheelNumber());
        System.out.println("Материал сидения: " + mountainBike.getSeatMaterial());
        System.out.println("Максимальная скорость велосипеда: " + mountainBike.getMaxSpeed());
        System.out.println("\n*******************************************\n");

        System.out.println("Ход производства обычного детского велосипеда: \n");
        ChildrenBike childrenBike = new ChildrenBike(2, "розовый/синий кожзам",
                20, true);
        childrenBike.produceFrame();
        childrenBike.addRudder();
        childrenBike.addWheels();
        System.out.println();
        System.out.println("Характеристики произведенного велосипеда: \n");
        System.out.println("Количество колес: " + childrenBike.getWheelNumber());
        System.out.println("Материал сидения: " + childrenBike.getSeatMaterial());
        System.out.println("Максимальная скорость велосипеда: " + childrenBike.getMaxSpeed());
        System.out.println("Наличие велосипедного колокольчика: " + (childrenBike.bikeBell ? "да" : "нет"));
        System.out.println("\n*******************************************\n");

        System.out.println("Ход производства маленького детского велосипеда: \n");
        SmallChildrenBike smallChildrenBike = new SmallChildrenBike(2,
                "гипоалергенный розовый/синий кожзам",20, true, 2);
        smallChildrenBike.produceFrame();
        smallChildrenBike.addRudder();
        smallChildrenBike.addWheels();
        smallChildrenBike.addAdditionalWheels();
        System.out.println();
        System.out.println("Характеристики произведенного велосипеда: \n");
        System.out.println("Количество колес изначально: " + smallChildrenBike.getWheelNumber());
        System.out.println("Количество колес после добавления дополнительных: " + (smallChildrenBike.additionalWheels +
                smallChildrenBike.getWheelNumber()));
        System.out.println("Материал сидения: " + smallChildrenBike.getSeatMaterial());
        System.out.println("Максимальная скорость велосипеда изначально: " + smallChildrenBike.getMaxSpeed());
        smallChildrenBike.setMaxSpeed(15);
        System.out.println("Максимальная скорость велосипеда после добавления дополнительных колес: " +
                smallChildrenBike.getMaxSpeed());
        System.out.println("Наличие велосипедного колокольчика: " + (smallChildrenBike.bikeBell ? "да" : "нет"));
        System.out.println("\n*******************************************\n");
    }
}
