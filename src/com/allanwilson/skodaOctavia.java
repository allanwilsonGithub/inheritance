package com.allanwilson;

/**
 * Created by awil on 2017-08-20.
 */
public class skodaOctavia extends Car {
    private String color;
    private int year;
    private int cruiseControl;

    public skodaOctavia (String type, int wheels, int steeringWheel, String gear, int speed, int bootSpace, String steering, int seats, String color, int year, int cruiseControl){
        super (type, 1, 1, wheels, steeringWheel, bootSpace, seats, steering, gear, speed);
        this.color = color;
        this.year = year;
        this.cruiseControl = 0;
    }

    public int getYear(){
        return year;
    }

    public int getCruiseControl(){
        return cruiseControl;
    }

    public void setCruiseControl(int newCruiseSpeed){
        System.out.println("Changing cruise control speed from " + cruiseControl + " to " + newCruiseSpeed);
        this.cruiseControl = newCruiseSpeed;
    }

}