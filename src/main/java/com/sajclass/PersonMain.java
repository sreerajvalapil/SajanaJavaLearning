package com.sajclass;

public class PersonMain {
    public static void main(String[] args) {
        /*Person sajana = new Person();
        sajana.setName("Sajana");

        Person sreeraj= new Person("Sreeraj");
        Person sreyaan= new Person("Sreeraj","s@gmail.com",12,100);*/

        Person sajana = new Person("Sajana", "sa@gmail.com", 25);

        Person sreyaan = new Person("Sreyaan", "Sre@gmail.com", 5);

        //System.out.println("Sreeraj TotalMarks and Grade:" + sreeraj.getTotalMarks() + "and" + sreeraj.getGrade());
        System.out.println("Before " + Person.collageName);
        Person.changeColName("ABCD");

        System.out.println(Person.collageName);

        Person sreeraj = new Person("Sreeraj", "s@gmail.com", 40);
        sreeraj.setTotalMarks(56);
        sreeraj.setLoanAmount(1200000);
        Bank hdfc= new Bank("HDFC","Bangalore","IFC1",8.6);
        /*double intAmount =getInterestRatefotOneYear(sreeraj,hdfc);
        System.out.println("Interest Rate: "+ intAmount);*/
        PersonMain pm =new PersonMain();
        double intAmount =pm.getInterestRatefotOneYear(sreeraj,hdfc);
        System.out.println("Interest Rate: "+ intAmount);
        Bank axisBank= new Bank("Axis Bank","Bangalore","AxisIFSC1",9);
        System.out.println("Sum of Interest Rate: "+pm.sumInterestRate(hdfc,axisBank));
        pm.checkStatus(hdfc);



    }
    public void checkStatus(Bank b1){

        if (b1.getInterestRate()>10)
            b1.setStatus("Invalid");
        else b1.setStatus("Valid");

    }
    public double sumInterestRate(Bank bank1,Bank bank2){
        double bank1Int=bank1.getInterestRate();
        double bank2Int=bank2.getInterestRate();
        double sum= bank1Int+bank2Int;
        return sum;
    }
    public double getInterestRatefotOneYear(Person person,Bank bank)    {
        double lAmount=person.getLoanAmount();
        double intRate=bank.getInterestRate();
        // Calculate Interest amount
        double intAmount= (lAmount*intRate)/100;
        return intAmount;
        // System.out.println("Interest Amount: "+ intAmount );
    }
}
