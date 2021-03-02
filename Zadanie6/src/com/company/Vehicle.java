package com.company;

public class Vehicle {
    String vehicle;
    Engine engine;
    Size size;
    Color color;

    public Vehicle(String vehicle, Engine engine, Size size, Color color){
        this.vehicle = vehicle;
        this.engine = engine;
        this.size = size;
        this.color = color;
    }



    @Override
    public String toString(){
        return "Marka "+ vehicle + "\nSilnik " + engine.engine + "\nDługośc " + size.size + "\nKolor "+ color.color;
    }

}
