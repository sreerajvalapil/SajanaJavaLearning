package com.collectionSaj;

import java.util.ArrayList;
import java.util.List;

public class VehicleArrayListTest {
    public static void main(String[] args) {
        List<Train> trainList= new ArrayList();
        Train train1=new Train(120,"LocalTrain");
        Train train2=new Train(100,"Mangala");
        trainList.add(train1);
        trainList.add(train2);
        for (Train t:trainList)
        {
            System.out.println("Train Name: "+t.getName());
            
        }


        List<Bus> busList = new ArrayList();

        Bus b1=new Bus(100,"Rosa");
        Bus b2=new Bus(101,"158");
        Bus b3=new Bus(100,"Rosaqq");
        busList.add(b1);
        busList.add(b2);
        busList.add(b3);
        for(Bus myBus : busList) {
            System.out.println( "The bus is :" +myBus.getBusName());
        }

        System.out.println("After Removal ....................................");


        busList.remove(b3);
        for(Bus myBus : busList) {
            System.out.println( "The bus is :" +myBus.getBusName());
        }
        System.out.println("Size of  a list: " +busList.size());
        System.out.println("Get list: " +busList.get(3).toString());
    }
}
