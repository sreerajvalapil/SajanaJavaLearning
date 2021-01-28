package com.overloadingDemo;

public class CarOverloading {
    public void increaseSpeed(int speed){
        System.out.println("speed increased in parent class by "+ speed);
    }
    public static void increaseSpeed(String gear){
        System.out.println("speed increased by "+ gear);
    }

}
