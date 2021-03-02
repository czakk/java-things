package com.company;

public class main {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle("Audi", new Engine("1.9 TDI"), new Size(6), new Color("Czarny"));
        System.out.println(veh);
    }
}
