package com.myLambda;

public class RoadCycling implements Cycling {
    @Override
    public int getSpeedLimit(String gearType) {
        if (gearType.equals("WithGear")) return 80;
        return 70;
    }
}
