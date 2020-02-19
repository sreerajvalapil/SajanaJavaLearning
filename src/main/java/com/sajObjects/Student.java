package com.sajObjects;

public class Student {
    private String name;
    private String regNo;

    @Override
    public String toString() {
        return this.name+ "-"+ this.regNo;

    }

    @Override
    public boolean equals(Object obj) {
        Student a=(Student) obj;
        return this.regNo==a.getRegNo();
    }

    public String getName() {
        return name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public Student(String name, String regNo) {
        this.name = name;
        this.regNo = regNo;
    }
}
