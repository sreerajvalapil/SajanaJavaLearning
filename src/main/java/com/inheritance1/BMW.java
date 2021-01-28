package com.inheritance1;

public class BMW extends Cars{

    public BMW(int speed) {
        super(speed);
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Increasing the speed of BMW car");
    }
    public void navigate(){
        System.out.println("Navigate in BMW");
    }
}
