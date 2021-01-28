package com.sajString;

public class StringMain {
    public static void main(String[] args) {
        System.out.println("Good monring ");

        String s2 = new String("Sree") ;
        System.out.println("s2 is .. : " + s2);

        s2 = s2.concat("raj");
        System.out.println("s2 is .. : " + s2);


        StringBuilder stringBuilder = new StringBuilder("Saj") ;
        System.out.println("stringBuilder is .. : " + stringBuilder);
        stringBuilder.append("Baskaran") ;
        System.out.println("stringBuilder is .. : " + stringBuilder);


    }
}
