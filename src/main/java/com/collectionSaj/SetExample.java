package com.collectionSaj;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set =new HashSet<String>();
        set.add("Sajana");
        set.add("Sreeraj");
        set.add("Sreyaan");
        Integer size= set.size();
        System.out.println(set);
        /*for(String name: set){
            System.out.println("Names in the set are: " +name);
        }
        set.add("Sajana");
        for(String name: set){
            System.out.println("Names in the set are: " +name);
        }*/

        Set<String> lHashSet = new LinkedHashSet<>();
        lHashSet.add("Lion");
        lHashSet.add("Snake");
        lHashSet.add("Rabbit");
        lHashSet.add("Rabbit");
        System.out.println(lHashSet);
        Set<String> tSet = new TreeSet<>();
        tSet.add("Malayalam");
        tSet.add("English");
        tSet.add("Swedish");
        tSet.add("Swedish");    
        System.out.println(tSet);




    }
}
