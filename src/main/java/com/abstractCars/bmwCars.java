package com.abstractCars;

public class bmwCars extends AbstractCarsc {
    public bmwCars(int speed) {
        super(speed);
    }

    @Override
    public void startEngine(String type, int cyl) {
        System.out.println("Car Type is "+ type +"and number of cylinder are"+ cyl);

    }
}
