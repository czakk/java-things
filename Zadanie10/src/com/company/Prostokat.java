package com.company;

public class Prostokat implements Figura{
    double a, b;

    public Prostokat(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double obliczPole() {
        return a*b;
    }

    @Override
    public double obliczObwod() {
        return (a*2) + (b*2);
    }
}
