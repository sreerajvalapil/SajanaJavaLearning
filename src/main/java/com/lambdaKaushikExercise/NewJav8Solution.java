package com.lambdaKaushikExercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class NewJav8Solution {
    public static void main(String[] args) {
        List<Person> personList= Arrays.asList(new Person("Sajana","Bhaskaran",12),
                new Person("Sreeraj","Ambadi",12),
                new Person("Sreyaan","Chodi",2),
                new Person("Sai","dagini",12));

        performConditionally(personList,p-> p.getFirstName().startsWith("S"),p-> System.out.println(p) );
        performConditionally(personList,p->p.getAge()<10,p-> System.out.println("Person name whose age is less than 10:"+p.getFirstName()));
    }

    private static void performConditionally(List<Person> personList, Predicate<Person> personPredicate, Consumer<Person> personConsumer) {
    for(Person p: personList){
        if (personPredicate.test(p))
            personConsumer.accept(p);

    }

    }
}

