package com.allanwilson;

import com.sun.org.apache.xpath.internal.SourceTree;

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

        Car car = new Car("Farmari",1,1,4,1,134,5, "Left", "Reverse",120);
        System.out.println("Car seats: " + car.getSeats());
        System.out.println("Car type: " + car.getType());

        skodaOctavia GreenMachine = new skodaOctavia("Family Mobile",4,1,"Reverse",157,145,"Right",5,"Highland Green", 2008, 1);
        System.out.println("GreenMachine seats: " + GreenMachine.getSeats());
        System.out.println("GreenMachine type: " + GreenMachine.getType());
        System.out.println("Greenmachine year: " + GreenMachine.getYear());
        System.out.println("Cruise control set to: " + GreenMachine.getCruiseControl());
        System.out.println("Increasing to 50...");
        GreenMachine.setCruiseControl(50);
        System.out.println("Cruise control now set to: " + GreenMachine.getCruiseControl());
        System.out.println("The Greenmachine is steering: " + GreenMachine.getSteering());
        GreenMachine.setSteering("Left");
        System.out.println("The Greenmachine is steering: " + GreenMachine.getSteering());

        System.out.println("Gear was: " + GreenMachine.getGear() + ".");
        GreenMachine.setGear("Second");
        System.out.println("Speed is: " + GreenMachine.getSpeed());
    }
}
