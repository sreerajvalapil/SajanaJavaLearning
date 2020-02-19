package com.myInterface;

public class Giraff implements Animal {

    @Override
    public void run() {
        System.out.println("Paaayum Giraff");
    }

    @Override
    public void makeSound() {
        System.out.println("KOOOO KKOOOO");
    }
}
