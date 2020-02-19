package com.collectionSaj;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<Bus> busSet= new HashSet<>();
        Bus bus1=new Bus(1,"Onyx");
        Bus bus2=new Bus(2,"KRP");
        Bus bus3=new Bus(1,"kkp");
        busSet.add(bus1);
        busSet.add(bus2);
        busSet.add(bus3);
        for (Bus b:busSet
             ) {
            System.out.println("Bus objects:"+ b.getBusNumber());

        }
    }
}
