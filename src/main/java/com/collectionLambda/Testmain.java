package com.collectionLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Testmain {
    public static void main(String[] args) {
        //Functional Interfaces:
        // Consumer- for each
        // Predicate- Filter
        // Supplier
        // Function- Map


        List<String> colorList = new ArrayList<>();
        colorList.add("Yellow");
        colorList.add("Yellow1234566121212121212121");
        colorList.add("Blue");
        colorList.add("Whilte");
        colorList.add("Green");
        colorList.add("Orange");
        colorList.add("Majenta1234566121212121212121");

        List<Integer> colorLengthList=colorList.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(colorLengthList);
        List<String> newColorList=colorList.stream().map(s -> s+"SWeden").collect(Collectors.toList());
        System.out.println(newColorList);

        for (String s:colorList){
            if (s.length()>10) colorList.remove(s);
        }
        List<String> newList = colorList.
                stream().
                filter(s ->
                {
                    if (s.length() < 10) return true;
                    return false;
                }).collect(Collectors.toList());


        System.out.println(newList);


        /*System.out.println(colorList);
        Consumer<String> myLambda=
          ( t)->{
              System.out.println(t);
        };

        colorList.stream().forEach(t->{
            System.out.println(t);
        });*/

        // This also
        //colorList.stream().forEach(System.out::println );
        List<Integer> lengthColorList=colorList.stream()
                .filter(s -> {
                    if(s.length()<10) return true;
                else return false;}).map(String::length).collect(Collectors.toList());
        System.out.println(lengthColorList);


    }

}
