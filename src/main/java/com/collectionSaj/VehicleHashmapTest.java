package com.collectionSaj;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VehicleHashmapTest {
    public static void main(String[] args) {
        Map<Integer,Train> trainMap=new HashMap<>();
        trainMap.put(100,new Train(230,"Malabar"));
        trainMap.put(200,new Train(220,"KannurExpress"));
        trainMap.put(100,new Train(800,"sss"));
        for (Map.Entry<Integer, Train> s:trainMap.entrySet())
        {
            Integer key= s.getKey();
            Train value= s.getValue();
            System.out.println("Key is: "+ key+"Value: "+ value);
        }


        Set<Integer> keySet=  trainMap.keySet();
        for (Integer ks:keySet){
            System.out.println("Key set: "+ks);

        }

        Set<Map.Entry<Integer,Train>> sajentrySet = trainMap.entrySet();
        for (Map.Entry<Integer,Train> es:sajentrySet){
            System.out.println("Entry Sets: "+ es);
        }


    }
}
