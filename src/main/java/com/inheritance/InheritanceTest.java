package com.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        String [] sub= new String[]{"Phys","Chemi"};
        Teacher sajana= new ScienceTeacher("Sajana","6666", sub);
        sajana.teach();
    }
}
