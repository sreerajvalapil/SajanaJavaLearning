package com.collectionSaj;

public class Bus {
    public Bus(Integer busNumber, String busName) {
        this.busNumber = busNumber;
        this.busName = busName;
    }



    public Integer getBusNumber() {
        return busNumber;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusNumber(Integer busNumber) {
        this.busNumber = busNumber;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    private Integer busNumber;
    private String busName;

    @Override
    public boolean equals(Object b3) {
        return this.getBusNumber().equals (((Bus) b3).getBusNumber()) ;
    }
    @Override
    public int hashCode() {
        return 700;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber=" + busNumber +
                ", busName='" + busName + '\'' +
                '}';
    }
}
