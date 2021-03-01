package com.company.z1;

public class Remote {

    TV tv = new TV();
    public void tv_on(){
        if (tv.on == false){
            tv.on = true;
            System.out.println("Telewizor został włączony");
        }
        else{
            tv.on = false;
            System.out.println("Telewizor został wyłączony");
        }
    }

    public void channel(String up_or_down) {
        if (tv.check_tv_on() == true) {


                if ((up_or_down == "up") && (tv.channel < 20) && (tv.channel > 1)){
                    tv.channel++;

                }
                else if ((up_or_down == "down") && (tv.channel > 1) && (tv.channel < 10) ){
                    tv.channel--;
                }

                System.out.println("Kanał ustawiony na "+ tv.channel);
        }
    }
    public void volume(String up_or_down){
        if (tv.check_tv_on() == true) {


            if ((up_or_down == "up") && (tv.volume < 10)){
                tv.volume++;
            }
            else if ((up_or_down == "down") && (tv.volume > 1)){
                tv.volume--;
            }
            System.out.println("Głośność ustawiona na "+ tv.volume);
        }

    }
}
