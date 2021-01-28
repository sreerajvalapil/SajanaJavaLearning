package com.sajclass;

public class Bank {
    private String bankName;
    private String address;
    private String ifcCode;
    private double interestRate;
    private String status="Valid";
    private String mmCode;

    public String getMmCode() {
        return mmCode;
    }

    public void setMmCode(String mmCode) {
        this.mmCode = mmCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAddress() {
        return address;
    }

    public String getIfcCode() {
        return ifcCode;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIfcCode(String ifcCode) {
        this.ifcCode = ifcCode;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Bank(String bankName, String address, String ifcCode, double interestRate) {
        this.bankName = bankName;
        this.address = address;
        this.ifcCode = ifcCode;
        this.interestRate = interestRate;
    }
}
