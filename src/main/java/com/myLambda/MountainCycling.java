package com.myLambda;

public class MountainCycling implements Cycling {
    @Override
    public int getSpeedLimit(String gearType) {
        if (gearType.equals("WithGear")) return 60;
        return 40;
    }
}
