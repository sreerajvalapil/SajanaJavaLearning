package com.collectionSaj;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();

        cars.add("Maruthi");
        cars.add("BMW");
        cars.add("Wagonar");
        int carSize= cars.size();
        System.out.println("The size of the arraylist is: "+carSize);
        System.out.println("The car which is present in the first index: "+cars.get(0));

        for(int i=0;i<carSize;i++){
            System.out.println("The car which is present in the "+i+" index: "+cars.get(i));
        }

        for (String car:cars){
            System.out.println("The item in the arraylist: "+car);

        }




    }
}
