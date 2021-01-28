package com.abstractCars;

public abstract class AbstractCarsc {
    int speed;

    public AbstractCarsc(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void startEngine(String type,int cyl);

}
