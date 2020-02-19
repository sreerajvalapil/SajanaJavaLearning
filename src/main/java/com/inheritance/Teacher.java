package com.inheritance;

public class Teacher {
    private String name;
    private String phone;
    private String subject="GK";


    public Teacher() {
    }

    public Teacher(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public void teach(){
        System.out.println("Hey.. I am teaching "+this.subject);
    }


}
