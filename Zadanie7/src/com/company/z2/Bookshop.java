package com.company.z2;

public class Bookshop extends Shop{
    private String[] products = {"Dlaczego Python to najlepszy język?", "Python wydanie dla najlepszych", "Kocham Pythona v10.0", "xDJava < Python"};

    Bookshop(String address, String size) {
        super(address, size);
    }

    @Override
    public void get_info(){
        super.get_info();
        System.out.println("Nasze ksiązki:");
        for (String i : products){
            System.out.println(i);
        }
    }
}

