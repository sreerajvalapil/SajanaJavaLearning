package com.collectionSaj;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> hMap = new HashMap<Integer, String>();
        hMap.put(1,"Sajana");
        hMap.put(2,"Sreyaan");
        System.out.println(hMap.get(1));
        for (Map.Entry<Integer,String > s: hMap.entrySet()){
            System.out.println(s.getValue());
        }
        System.out.println("Getting element using keyset");
        for (Integer key: hMap.keySet()){
            System.out.println(hMap.get(key));
        }
        // It maintains the order in which it added
        Map<Integer,String > lHMap= new LinkedHashMap<>();

        // It maintains the natural sorting order
        Map<Integer,String> tMap = new TreeMap<>();




    }

}
