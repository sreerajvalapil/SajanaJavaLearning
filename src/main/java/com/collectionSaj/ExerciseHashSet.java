package com.collectionSaj;

import java.util.*;

public class ExerciseHashSet {
    public static void main(String[] args) {
        Set<String> colorSet=new HashSet<>();
        Set<String> fruitSet=new HashSet();
        colorSet.add("I am Good");
        colorSet.add("Yellow");
        colorSet.add("Orange");
        colorSet.add("Green");
        fruitSet.add("Mango");
        fruitSet.add("Orange");
        fruitSet.add("Banana");
        System.out.println("Colours uin the Hash set: "+ colorSet);
        colorSet.add("Yelloow");
        System.out.println("After:Colours uin the Hash set: "+ colorSet);
        Iterator<String> p= colorSet.iterator();

        while (p.hasNext()){

            System.out.println(p.next());
        }
        System.out.println("Number of elements in a hash set: "+colorSet.size());
        /*colorSet.clear();
        System.out.println("Colours uin the Hash set after emptying: "+ colorSet);*/
        //HashSet<String> clonSet= new HashSet<>();
        //clonSet= (HashSet<String>) colorSet.clone();
        String[] colorArray= new String[colorSet.size()];
        colorSet.toArray(colorArray);
        for (String colorsvalue:colorArray)
        {
            System.out.println("Color Arrays: "+colorsvalue);
        }
        List<String> colorList= new ArrayList<>(colorSet);
        System.out.println("Array list contents: "+colorList);
        System.out.println("Compare: "+colorSet.contains(fruitSet));













    }


}
