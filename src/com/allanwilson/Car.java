package com.allanwilson;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by awil on 2017-08-14.
 */
public class Car extends Vehicle {
    private int bootSpace;
    private int seats;
    private String steering;
    private String gear;
    private int speed;

    public Car (String type, int body, int engine, int wheels, int steeringWheel, int bootSpace, int seats, String steering, String gear, int speed) {
        super(type, body, engine, wheels, steeringWheel);
        this.bootSpace = bootSpace;
        this.seats = seats;
        this.steering = steering;
        this.gear = gear;
        this.speed = speed;
    }

    public int getSeats(){
        return seats;
    }

    public String getSteering(){
        return steering;
    }

    public void setSteering(String steeringDirection){
        System.out.println("The car is now steering: " + steeringDirection);
        this.steering = steeringDirection;
    }

    public String getGear(){
        return gear;
    }

    public void setGear(String newGear){
        if (newGear == "First" ) {
            System.out.println("Setting gear to : " + newGear);
            this.gear = newGear;
        } else if (newGear == "Second" ){
            System.out.println("Setting gear to : " + newGear);
            this.gear = newGear;
        } else {
            System.out.println(newGear + " wasn't a valid gear");
        }

        System.out.println("Gear in now set to: " + this.gear);
    }

    public int getSpeed(){
        return speed;
    }
}
