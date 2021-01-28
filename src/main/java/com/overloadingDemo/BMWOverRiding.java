package com.overloadingDemo;

public class BMWOverRiding extends CarOverloading{
    @Override
    public void increaseSpeed(int s){
        super.increaseSpeed(10);
        System.out.println("increasing speed in the child class");

    }
}
