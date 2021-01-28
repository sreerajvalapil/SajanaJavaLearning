package com.interfaceDemo;

public class Dog implements Animal{
    @Override
    public void run(){
        System.out.println("Dog walk");
    }

    @Override
    public void makeSound(){
        System.out.println("Bow Bow");
    }
}
