package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal animal = new Animal(1, 1,3,4,"Animal");
        Dog dog = new Dog(4,5,"Yorkie",2,4,9,30, "long");

        dog.eat();
        dog.walk();
        dog.run();
    }
}
