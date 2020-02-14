package com.sajclass;

public class PersonMain {
    public static void main(String[] args) {
        /*Person sajana = new Person();
        sajana.setName("Sajana");

        Person sreeraj= new Person("Sreeraj");
        Person sreyaan= new Person("Sreeraj","s@gmail.com",12,100);*/
        Person sajana = new Person("Sajana", "sa@gmail.com", 25);
        Person sreeraj = new Person("Sreeraj", "s@gmail.com", 40);
        Person sreyaan = new Person("Sreyaan", "Sre@gmail.com", 5);
        sreeraj.setTotalMarks(56);
        System.out.println("Sreeraj TotalMarks and Grade:" + sreeraj.getTotalMarks() + "and" + sreeraj.getGrade());
        System.out.println("Before " + Person.collageName);
        Person.changeColName("ABCD");

        System.out.println(Person.collageName);
    }
}
