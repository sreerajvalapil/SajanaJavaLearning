package com.sajdatatypes;

public class SajDataTypes {
    public static void main(String[] args) {
        String name1, name2;
        String name3 = new String("sajana");
        String name4 = new String("sajana");
        name1 = "Sajana";
        name2 = "Sajana";
        boolean s = comparetwostring(name3, name4);
        System.out.println("StringCompare:" + s);
        int age1 = 3;
        int age2 = 4;
        System.out.println("Integer Compare:" + comparetwointeger(age1, age2));

        Integer age3 = 5;
        Integer age4 = 4;
        System.out.println("Average= " + getAverage(age3, age4));

        double a = 10.8;

        float d = 19;


    }

    public static boolean comparetwostring(String a, String b) {
       /* if (a.equals(b)){
            return true;
        }
        else
        {
            return false;
        }*/

        boolean result = a.equals(b) ? true : false;
        return result;
    }

    public static boolean comparetwointeger(int a, int b) {


        boolean result = a == b ? true : false;
        return result;
    }

    public static double getAverage(Integer a, Integer b) {


        double result = (a + b) / 2.0;

        return result;
    }
}
