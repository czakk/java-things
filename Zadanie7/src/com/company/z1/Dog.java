package com.company.z1;

public class Dog extends Animal{

    public Dog(String name, String color){
        super(name, color);
    }

    public void makeSound() {
        System.out.println(name + " pies koloru " + color + " wydaje dzwiek 'Hau'");
    }
}
