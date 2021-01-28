package com.exercise;

import java.util.ArrayList;
import java.util.List;

public class SellerCars {
    public List sellCars(List<Cars> allCars){
        List<Cars> bakiCars= new ArrayList();
        for (Cars p:allCars)
              {
            if (p.getId()>3) {
                bakiCars.add(p);

            } ;
        }
        return bakiCars;

    }
}
