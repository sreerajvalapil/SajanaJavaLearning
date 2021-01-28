package com.assignment;

public class test {
    public static void main(String[] args) {
        System.out.println("Hai Man");

        new test().solution("aaa");
    }

    public int solution(String S) {
        if(S.contains("aaa")) {
            return -1;
        }

        int result  = 0 ;
        for (int i = 0; i < S.length(); i++){
            char firstChar = S.charAt(i);
            char secondChar = S.charAt(i+1);

            if(firstChar =='a' && secondChar =='a') {
                i = i +1 ;
            } else {

            }

            //Process char
        }
        return result ;
    }
}

