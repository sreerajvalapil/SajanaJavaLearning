package com.myInterface2;

public class GreeterMain {
    public static void main(String[] args) {
        GreeterMain greeterMain=new GreeterMain();

        Greeting googMorning=new GoogMorning();
        greeterMain.greetToday(googMorning);

        Greeting hw=new HelloworldGreeting();
        greeterMain.greetToday(hw);

        greeterMain.calculate(3);
        greeterMain.calculate(4);
        greeterMain.calculate(53);




    }

    public void calculate( Integer myInteger )
    {

    }

    public void greetToday( Greeting greetingObj )
    {
        greetingObj.greet();
    }
}
