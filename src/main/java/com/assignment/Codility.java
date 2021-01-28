package com.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Codility {

    public int solution1(int[] A) {
       List<Integer> list=   Arrays.stream(A).boxed().collect(Collectors.toList());
        // write your code in Java SE 8
        for (int i = 1  ; i<=Integer.MAX_VALUE ; i++) {
            if(!list.contains(i))
                return  i ;
        }
        return Integer.MAX_VALUE ;
    }

    public int solution(int[] A) {
        Set<Integer> set=   Arrays.stream(A).boxed()
                .filter(a->a>0)
                .collect(Collectors.toSet());
        // write your code in Java SE 8
        int i = 0;
        for ( i = 1  ; i<=A.length ; i++) {
            if(!set.contains(i))
                return  i ;
        }
        return i ;
    }
    }
