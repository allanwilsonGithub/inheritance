package com.allanwilson;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Pike", 3, 5, 2, 2, 3);
        System.out.println("Fish gills: " + fish.getGills());
        System.out.println("Fish eyes:" + fish.getEyes());
        System.out.println("Number of fins: " + fish.getFins());
        System.out.println("Fish brains: " + fish.getBrain());

        Vehicle vehicle = new Vehicle("Truck", 1, 1, 4, 1);
        System.out.println("Vehicle type: " + vehicle.getType());
    }
}
