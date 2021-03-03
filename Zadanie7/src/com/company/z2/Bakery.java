package com.company.z2;

public class Bakery extends Shop{
    private String[] products = {"Bułeczki", "Pizzernika", "Bagieta", "Pączek z Pythonem"};

    Bakery(String address, String size) {
        super(address, size);
    }

    @Override
    public void get_info(){
        Shop shop = new Shop(address, size);
        shop.get_info();
        System.out.println("Nasze wypieki:");
        for (String i : products){
            System.out.println(i);
        }
    }
}
