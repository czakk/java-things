package com.company;

public class Trapez implements Figura{
    double a, b, h;

    public Trapez(double a, double b, double h){
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double obliczPole() {
        //return ((1/2)*(a+b))*h;
        return ((a+b)*h)/2;
    }

    @Override
    public double obliczObwod() {
        return a+b+(h*2);
    }
}
