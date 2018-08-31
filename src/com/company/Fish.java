package com.company;

/**
 * created by s.a.miroshnychenko 8/31/2018
 */

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(int size, int weight, String name, int gills, int eyes, int fins) {

        super(1, 1, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {

    }

    public void moveMuscles() {

    }

    public void moveBackFin() {

    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
