package com.interfaceDemo;

public class Cat implements Animal{
    @Override
    public void run() {
        System.out.println("Cat walk");
    }

    @Override
    public void makeSound() {
        System.out.println("Meawwww");

    }
}
