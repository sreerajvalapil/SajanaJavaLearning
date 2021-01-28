package com.exercise;

public class AddArray {
    public static void main(String[] args) {
        Integer marks[] = new Integer[]{10,20,30};
        int sum=0;
        for (int a:marks)
             {

                 sum= sum+a;
             }
        System.out.println("Sum Value of an Array: "+ sum);


    }
}
