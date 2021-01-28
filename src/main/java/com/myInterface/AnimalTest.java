package com.myInterface;

public class AnimalTest  {
    //dynamic binding
    public void testAnimal(Animal a){
        a.run();
        a.makeSound();
    }

    // statoc binding
    public void testBLA(Giraff a){
        a.run();
        a.makeSound();
    }
}
