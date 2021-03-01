package com.company.z1;

public class TV {
    boolean on;
    int volume;
    int channel;

    public TV() {
        this.channel = 1;
        this.volume = 1;
        this.on = false;
    }

    public boolean check_tv_on(){
        if (this.on == false) {
            System.out.println("Telewizor jest wyłączony!");
        }
        return this.on;
    }



}
