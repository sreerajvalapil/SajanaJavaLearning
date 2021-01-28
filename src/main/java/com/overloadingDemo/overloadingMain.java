package com.overloadingDemo;

public class overloadingMain {
    public static void main(String[] args) {
        CarOverloading C1= new CarOverloading();
        BMWOverRiding B1=new BMWOverRiding();

        C1.increaseSpeed("First Gear");
        C1.increaseSpeed(12);
        B1.increaseSpeed(10);

    }
}
