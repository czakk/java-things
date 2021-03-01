package com.company.z2;

public class main {
    public static void main(String[] args) {

        Wiatrak wiatrak = new Wiatrak();
        wiatrak.info();

        Wiatrak wiatrak2 = new Wiatrak(Wiatrak_Level.MEDIUM.level, true, 30.0, "White");
        wiatrak2.info();
    }
}
