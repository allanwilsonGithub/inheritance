package com.allanwilson;

/**
 * Created by awil on 2017-08-14.
 */
public class Vehicle {
    private String type;
    private int body;
    private int engine;
    private int wheels;
    private int steeringWheel;

    public Vehicle(String type, int body, int engine, int wheels, int steeringWheel){
        this.type = type;
        this.body = body;
        this.engine = engine;
        this.wheels = wheels;
        this.steeringWheel = steeringWheel;
    }

    public String getType(){
        return type;
    }
}
