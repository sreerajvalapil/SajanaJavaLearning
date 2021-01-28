package com.collectionSaj;

public class Train {
    private double speed;
    private String name;

    public Train(double speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Train{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 1500;
    }
}
