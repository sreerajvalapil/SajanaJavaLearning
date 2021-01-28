package com.inheritance;

public class ComputerTeacher extends Teacher {
    private String[] computerLanguage;



    public ComputerTeacher(String name, String phone, String[] computerLanguage) {
        super(name, phone);
        this.computerLanguage = computerLanguage;
    }


    @Override
    public void learn() {

    }
}
