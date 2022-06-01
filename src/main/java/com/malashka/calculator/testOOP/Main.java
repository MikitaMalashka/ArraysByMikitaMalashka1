package com.malashka.calculator.testOOP;

public class Main {
    public static void main(String[] args) {
        System.out.println("homoSapiens: ");
        HomoSapiens homoSapiens = new HomoSapiens("Huila", 105, 195, true, true);
        homoSapiens.walk();
        homoSapiens.jump();

        System.out.println("-------------------------------");
        System.out.println("cat: ");
        Cat cat = new Cat("Cat", 30, 15);
        cat.walk();
        cat.jump();
        cat.meows();
        cat.lovesPerson();

        System.out.println("-------------------------------");
        System.out.println("Muha: ");
        Cat muha = new BritishСat("Muha", 20, 8);
        muha.walk();
        muha.jump();
        muha.meows();
        muha.lovesPerson();

        System.out.println("-------------------------------");
        System.out.println("Hulio: ");
        Cat persianCat = new PersianCat("Hulio", 18, 10);
        persianCat.walk();
        persianCat.jump();
        persianCat.meows();
        persianCat.lovesPerson();

        Dog dog = new Dog("Sosiska", 40, 50);
        dog.walk();
        dog.jump();
        dog.barks();


        System.out.println(dog.getName() + " " + dog.getHeight() + " " + dog.getWeight());
        dog.setName("sobaka zabiaka");
        dog.setHeight(64);
        dog.setWeight(68);
        System.out.println(dog.getName() + " " + dog.getHeight() + " " + dog.getWeight());
    }
}
