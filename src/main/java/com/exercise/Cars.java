package com.exercise;

public class Cars {
    private int id;
    private String Name;
    private int cost;
    private String companyName;

    public Cars(int id, String name, int cost) {
        this.id = id;
        Name = name;
        this.cost = cost;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
