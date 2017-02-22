package com.novauc;

/**
 * Created by JacobP on 2/14/17.
 */
public class Animal {

    String name;

    public void makeSound() {
        System.out.println("Animal Sound!");

    }
    @Override
    public String toString() {
        return this.name;
    }
}
