package com.inheritance;

public class ScienceTeacher extends Teacher {
    private String[] subjectArray;

    public ScienceTeacher(String name, String phone, String[] subjectArray) {
        super(name, phone);
        this.subjectArray = subjectArray;
    }

    @Override
    public void teach() {
        super.teach();
        for (String a:this.subjectArray
             ) {
            System.out.println("Hey.. I am teaching this subject also: "+a);

        }



    }

    @Override
    public void learn() {

    }
}
