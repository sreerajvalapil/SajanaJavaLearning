package com.sajArray;

import com.sajclass.Bank;

public class MyArray {
    public static void main(String[] args) {
        int markStudent[] = new int[10];

        String[] stuName = new String[10];

        Bank bankObjArray[] = new Bank[3];

        Bank bank1 = new Bank("Cop1", "Tpba", "Cop1", 4);
        Bank bank2 = new Bank("Cop2", "Tpba", "Cop2", 4);
        Bank bank3 = new Bank("Cop3", "Tpba", "Cop3", 4);

        bankObjArray[0] = bank1;
        bankObjArray[1] = bank2;
        bankObjArray[2] = bank3;
        //bankObjArray[3]=bank1;

        int j = 10;
        for (int i = 0; i < 10; i++) {
            markStudent[i] = j++;
            System.out.println(markStudent[i]);

        }
        /*for (int k=0;k<3;k++){
            System.out.println(bankObjArray[k].getBankName());
        }*/
//For each loop
        for (Bank b : bankObjArray) {
            System.out.println(b.getBankName());
        }
        for (int c : markStudent) {
            System.out.println(c);
        }
        //Integer markStudent1[] = new Integer[3];
        Integer[] markStudent1= new Integer[]{22, 34, 56};
        for (Integer d:markStudent1){
            System.out.println(d);
        }





    }
}
