package com.allanwilson;

/**
 * Created by awil on 2017-08-14.
 */
public class Car extends Vehicle {
    private int bootSpace;
    private int seats;

    public Car (String type, int body, int engine, int wheels, int steeringWheel, int bootSpace, int seats) {
        super(type, body, engine, wheels, steeringWheel);
        this.bootSpace = bootSpace;
        this.seats = seats;
    }

    public int getSeats(){
        return seats;
    }
}
