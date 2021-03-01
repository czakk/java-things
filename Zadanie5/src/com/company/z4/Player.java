package com.company.z4;
import java.util.Scanner;

public class Player {

    Scanner scanner = new Scanner(System.in);
    int health;
    int damage;
    int armor;

    Player(){
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }
    public void choose_eq(){
        System.out.println("Wybierz swoja klase\n1. 'Toporownik', 80HP, 10DMG, 2ARM\n2. 'Czołg', 110HP, 5DMG, 11ARM\n3. 'Mag', 100HP, 8DMG, 0ARM");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                health = 85;
                damage = 11;
                armor = 4;
                break;
            case 2:
                health = 125;
                damage = 6;
                armor = 8;
                break;
            case 3:
                health = 115;
                damage = 16;
                armor = 0;
                break;
        }

    }

}
