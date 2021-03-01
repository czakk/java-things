package com.company.z1;

public class main {
    public static void main(String[] args) {

        Remote pilot = new Remote();
        pilot.volume("up");
        pilot.tv_on();
        pilot.volume("up");

        pilot.volume("down");
        pilot.volume("down");
        pilot.volume("down");

        pilot.channel("up");
        pilot.tv_on();
        pilot.channel("down");

    }
}
