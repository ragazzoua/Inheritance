package com.company;

/**
 * created by s.a.miroshnychenko 8/31/2018
 */

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog( int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail=tail;
        this.teeth = teeth;
        this.coat=coat;
    }

    private void chew() {
        System.out.println("Dog.chew called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() caleed ");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.moved() called");
        moveLegs(speed);
        super.move(speed);
    }
}
