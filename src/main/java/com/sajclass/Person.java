package com.sajclass;

public class Person {
    private String name;
    private String email;
    private int age;
    private int totalMarks;
    private String grade;
    static String collageName="SNGC";
static void changeColName(String a){
    collageName=a;
}

    public String getGrade() {
        return grade;
    }

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
/* public Person(String name) {
        this.name = name;
    }

    public Person(String name, String email, int age, int totalMarks) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.totalMarks = totalMarks;
    }

    public Person() {

    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
        setGrade(this.totalMarks);

    }

    private void setGrade(int totalMarks) {
        if (this.totalMarks>=80)
            this.grade="Dist";
        else if(this.totalMarks>=60 && this.totalMarks<80)
            this.grade= "First";
        else if(this.totalMarks>=30 && this.totalMarks<60)
            this.grade="Second";
        else
            this.grade="Fail";
    }
}
