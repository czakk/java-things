package com.company.z1;

public class Cat extends Animal{


    public Cat(String name, String color) {
        super(name, color);
    }

    public void makeSound() {
        System.out.println(name + " kot koloru " + color + " wydaje dzwiek 'Miał'");
    }
}
