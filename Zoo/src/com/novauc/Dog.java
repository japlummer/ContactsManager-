package com.novauc;

/**
 * Created by JacobP on 2/14/17.
 */
public class Dog extends Mammal {

    public Dog() {
        this.name = "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");

    }

}
