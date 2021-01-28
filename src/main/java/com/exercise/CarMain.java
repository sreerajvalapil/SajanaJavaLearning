package com.exercise;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        ProduceCars pc = new ProduceCars();
        List<Cars> carList = new ArrayList();
        carList = pc.produceCar();
        SellerCars sc = new SellerCars();
        //ArrayList remCar=new ArrayList();
        List<Cars> remCar = sc.sellCars(carList);
        for (Cars f : remCar ) {
            System.out.println("Remaining Cars :" + f);


        }

    }
}
