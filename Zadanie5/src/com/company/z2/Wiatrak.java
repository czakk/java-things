package com.company.z2;

public class Wiatrak {
    int speed;
    boolean on;
    double radius;
    String color;

    public Wiatrak(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    Wiatrak(){
        this.speed = Wiatrak_Level.SLOW.level;
        this.on = false;
        this.radius = 20;
        this.color = "Black";
    }
    public void info(){
        System.out.println("Prędkośc wiatraka: " + this.speed + "\nWłączony?: "+this.on+"\nPromień wiatraka: "+this.radius+"\nKolor: "+this.color);
    }

}
