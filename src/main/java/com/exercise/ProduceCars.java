package com.exercise;

import java.util.ArrayList;
import java.util.List;

public class ProduceCars {

   public List<Cars> produceCar(){
       Cars car1= new Cars(1,"Car1",100);
       Cars car2= new Cars(2,"Car2",200);
       Cars car3= new Cars(3,"Car3",300);
       Cars car4= new Cars(4,"Car4",400);
       Cars car5= new Cars(5,"Car5",500);
       List<Cars> listCars=new ArrayList();
       listCars.add(car1);
       listCars.add(car2);
       listCars.add(car3);
       listCars.add(car4);
       listCars.add(car5);
       return listCars;
   }

    public List<Cars> produceVolvoeCars(String[] nameArray){
        int i=0;
        List<Cars> objCars= new ArrayList<>();
        for (String names:nameArray)
             {
                 i++;
                 Cars c=new Cars(i,names,1200);
                 c.setCompanyName("VolvoCars");
                 objCars.add(c);
        }
        return objCars;





      // return ArrayList();
    }





}
