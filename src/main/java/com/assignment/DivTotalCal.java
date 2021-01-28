package com.assignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DivTotalCal {
    public  Map<String,Integer> totalDiv(List<Students> studLists){
        Map <String,Integer> resultmap= new HashMap<>();
        for(Students s: studLists){
            String div=s.getDivision();
            Integer mark=s.getMark();
            //
            Integer markValue=resultmap.get(div);
            if(markValue!=null) {
                Integer totalMarks= markValue+mark;
                resultmap.put(div,totalMarks);
            } else {
                resultmap.put(div,mark);
            }
        }
        return resultmap;
    }
}
