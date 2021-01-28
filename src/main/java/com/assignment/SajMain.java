package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SajMain {
    public static void main(String[] args) {
        Students s1=new Students("Sajana","A",88);
        Students s2=new Students("Sreeraj","A",70);
        Students s3=new Students("Chandri","B",80);
        Students s4=new Students("Bhask","C",90);
        Students s5=new Students("Sai","B",60);
        Students s6=new Students("Anjal","C",56);
        List<Students> studLists= new ArrayList<>();
        studLists.add(s1);
        studLists.add(s2);
        studLists.add(s3);
        studLists.add(s4);
        studLists.add(s5);
        studLists.add(s6);
        DivTotalCal totalcalobj= new DivTotalCal();
        Map <String,Integer> result= new HashMap<>();
        result=totalcalobj.totalDiv(studLists);
        System.out.println(result);








    }
}
