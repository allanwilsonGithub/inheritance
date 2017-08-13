package com.allanwilson;

/**
 * Created by awil on 2017-08-14.
 */
public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins){
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(11);
    }

    public int getGills(){
        return gills;
    }

    public int getEyes(){
        return eyes;
    }

    public int getFins(){
        return fins;
    }
}
