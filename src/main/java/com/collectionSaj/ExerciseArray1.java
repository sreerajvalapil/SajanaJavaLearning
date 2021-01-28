package com.collectionSaj;

import java.util.ArrayList;
import java.util.List;

public class ExerciseArray1 {
    public static void main(String[] args) {
        List<String> color= new ArrayList<>();
        List<String> fruitList=new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Orange");
        color.add("Whilte");
        color.add("Green");
        color.add("Blue");
        /*for (String colors:color)
        {
            System.out.println("Colors in the array: "+ colors);

        }
        color.add(0,"Yellow");
        for (String colors:color)
        {
            System.out.println("Colors in the array after inserting: "+ colors);

        }*/
        System.out.println(color);
        //System.out.println(color.get(0));
        color.set(0,"Red");
        System.out.println(color);
        if (color.contains("yellow"))
        {
            System.out.println("Found Blue");
        }
        else
        {
            System.out.println("not found");
        }
        /*for (String colors:color)
        {
            if (colors== "Blue")
            {
                System.out.println("Found Blue");
            }

           // System.out.println("Colors in the array: "+ colors);

        }*/
        System.out.println("Joined: " +color.addAll(fruitList));
        System.out.println("New Lists: "+ color);


    }
}
