package com.company;

public class main {
    public static void main(String[] args) {
        Kwadrat kwd = new Kwadrat(4);
        Prostokat pkt = new Prostokat(2,4);
        Trapez tpz = new Trapez(8,5,4);

        System.out.println("Kwadrat:\nObwód: "+kwd.obliczObwod()+"\nPole: "+kwd.obliczPole());
        System.out.println("Prostokąt:\nObwód: "+pkt.obliczObwod()+"\nPole: "+pkt.obliczPole());
        System.out.println("Trapez:\nObwód: "+tpz.obliczObwod()+"\nPole: "+tpz.obliczPole());

    }
}
