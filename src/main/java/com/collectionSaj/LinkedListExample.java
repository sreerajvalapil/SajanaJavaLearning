package com.collectionSaj;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> vehicles= new LinkedList<String>();
        vehicles.add("Bus");
        vehicles.add("Cycle");
        vehicles.add("car");
        int vehSize= vehicles.size();
        for (String vehicle:vehicles){
            System.out.println("Vehicle list items : "+vehicle );
        }


    }
}
