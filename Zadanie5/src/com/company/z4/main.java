package com.company.z4;

public class main {
    public static int attack(int damage, int armor){
        if (damage > armor) {
            return damage - armor;
        }
        else{
            return armor - damage;
        }
    }
    public static void main(String[] args) {

        Player pl = new Player();
        pl.choose_eq();

        Enemy en = new Enemy();
        en.choose_eq();

//        System.out.println(pl.damage+" "+ pl.armor+ " "+ en.damage + " "+ en.armor+ " "+ attack(pl.damage, en.armor));

        while (true){
            en.health -= attack(pl.damage, en.armor);
            System.out.println("Uderzasz przeciwnika za: "+attack(pl.damage, en.armor) + " i ma teraz ilosc HP: "+ en.health);
            if (en.health <= 1){
                System.out.println("Wygrałeś!");
                break;
            }
            pl.health -= attack(en.damage, pl.armor);
            System.out.println("Przeciwnik uderza cie za: "+ attack(en.damage, pl.armor) + " i masz HP: "+ pl.health);
            if (pl.health <= 1){
                System.out.println("Przegrałeś!");
                break;
            }
        }


    }
}
