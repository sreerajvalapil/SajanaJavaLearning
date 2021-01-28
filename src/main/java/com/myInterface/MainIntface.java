package com.myInterface;

public class MainIntface {
    public static void main(String[] args) {
        Animal giraff1= new Giraff();
        //giraff1.run();
        //giraff1.makeSound();
        Animal dog=new Dog();
        //dog.run();
        //dog.makeSound();
        AnimalTest test=new AnimalTest();

        test.testAnimal(giraff1);
        test.testAnimal(dog);

    }
}
