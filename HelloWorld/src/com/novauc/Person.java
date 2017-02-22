package com.novauc;

/**
 * Created by JacobP on 2/7/17.
 */
public class Person {
    String name;
    int age;
    boolean isAlive;

    String getName() {
        return name;
    }

    void setName(String name) {this.name = name;}




    int getAge() {return age;}



    void setAge(int age) {

        if (age > 0 && age < 151) {
            this.age = age;

        } else {
            System.out.println("Not a valid age");
        }
    }

    boolean getIsAlive() {
        return isAlive;
    }

    void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }







}
