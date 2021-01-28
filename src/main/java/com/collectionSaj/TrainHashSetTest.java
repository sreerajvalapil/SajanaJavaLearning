package com.collectionSaj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TrainHashSetTest {
    public static void main(String[] args) {
        Set<String> trainSet = new HashSet<>() ;
        trainSet.add("netravati") ;
        trainSet.add("mangala") ;
        trainSet.add("malabar express") ;
        trainSet.add("lakshdweep exprres 124567") ;
      for(String a : trainSet) {
          System.out.println(a);
      }

      Map<String,Integer> trainMap = new HashMap<>() ;
        trainMap.put("netravati" ,100);
        trainMap.put("mangala" ,100);
        trainMap.put("malabar express" ,100);
        trainMap.put("lakshdweep exprres 124567" ,100);

        String s = "sreeraj" ;
        System.out.println("hashcode of sreeraj is : " +s.hashCode());

        Train malabar = new Train(1200,"malabar") ;
        System.out.println("Malabar HAshcode is :" + malabar.hashCode());

        Train netra = new Train(1300,"netravathi") ;
        System.out.println("Malabar Hashcode is :" + netra.hashCode());
    }



}
