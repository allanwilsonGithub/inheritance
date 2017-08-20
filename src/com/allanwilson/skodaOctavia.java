package com.allanwilson;

/**
 * Created by awil on 2017-08-20.
 */
public class skodaOctavia extends Car {
    private String color;
    private int year;

    public skodaOctavia (String type, int body, int engine, int wheels, int steeringWheel, int bootSpace, int seats, String color, int year){
        super (type, body, engine, wheels, steeringWheel, bootSpace, seats);
        this.color = color;
        this.year = year;
    }

    public int getYear(){
        return year;
    }
}