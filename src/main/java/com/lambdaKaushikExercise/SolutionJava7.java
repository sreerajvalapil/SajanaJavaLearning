package com.lambdaKaushikExercise;

import java.util.*;
import java.util.function.Predicate;

public class SolutionJava7 {
    public static void main(String[] args) {
        List<Person> personList= Arrays.asList(new Person("Sajana","Bhaskaran",12),
                new Person("Sreeraj","Ambadi",12),
                new Person("Sreyaan","Chodi",2),
                new Person("Sai","dagini",12));
        // Sort with last name
        Comparator comp= new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Person op1=(Person)o1;
                Person op2=(Person)o2;
                return op1.getLastName().compareTo(op2.getLastName());
            }
        };

        // Calling old fashion
        System.out.println("Alphabetical Order:");
        Collections.sort(personList,comp);
        System.out.println(personList);

        // Calling by inline method for Descending alphebetical order

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getLastName().compareTo(o1.getLastName());
            }
        });
        // Print in Descending alphebetical order
        System.out.println("Reverse Alphabetical Order without Type casting:");
        System.out.println(personList);

        // Calling lambda for first name ascending order
        Collections.sort(personList,((o1, o2) -> {
            Person op1=(Person)o1;
            Person op2=(Person)o2;
            return op1.getFirstName().compareTo(op2.getFirstName());
        }));
        System.out.println("Alphabetical Order for first name:");
        System.out.println(personList);

        Condition condition=new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("K");
            }
        };
       //Inline calling
        System.out.println("Print whose first name length is greater than 4");
        printConditionally(personList, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().length()>4;
            }
        });

        // Java8 Interface Predicate java util function calling

        //Lambda Calling
        System.out.println("Print whose age is less than 10");
        printConditionally(personList,p -> {return p.getAge()<10;});



        /*prinntAll(personList);
        //Print only whose last name startts with C
        printStartswithC(personList);*/




       // System.out.println(personList);
        //Lambda


    }




    static void printConditionally(List<Person> pl, Condition condition) {

        for (Person per:pl)
        {
            Person p=(Person)per;
            if (condition.test(p))
            System.out.println(p);

        }

    }

    /*private static void printStartswithC(List<Person> personList) {
        for(Person p:personList){
            if (p.getLastName().startsWith("K"))
                System.out.println(p);

        }
    }

    private static void prinntAll(List<Person> personList) {
        for (Person p:personList){
            System.out.println(p);


        }*/
    interface Condition{
        boolean test(Person p);
    }
    }


