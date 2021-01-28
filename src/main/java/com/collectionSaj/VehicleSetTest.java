package com.collectionSaj;

import java.util.HashSet;
import java.util.Set;

public class VehicleSetTest {
    public static void main(String[] args) {
        Set<Bus> busSet= new HashSet<>();
        busSet.add(new Bus(12,"Sudrty"));
        for (Bus busIter:busSet)
              {
                  System.out.println(busIter);
        }


    }
}
