package com.company.z3;
import java.util.Scanner;

public class Konto{
    double balance = 100.0;
    Scanner scanner = new Scanner(System.in);


    public void deposit(){
        System.out.print("Ile chcesz wpłacic?");
        double amount = scanner.nextDouble();
        if (amount < 0 ){
            System.out.println("Próbujesz wpłacić minusową liczbę pieniędzy");
        }
        else{
            this.balance += amount;
        }
    }
    public void withdraw(){
        System.out.print("Ile chcesz wypłacic?");
        double amount = scanner.nextDouble();
        if (amount < 0 ) {
            System.out.println("Próbujesz wpyłacić minusową liczbę pieniędzy");
        }
        else {
            if (amount > this.balance) {
                System.out.println("Nie masz tylu środków na koncie");
            } else {
                this.balance -= amount;
            }
        }
    }
    public void info(){
        System.out.println("Twój stan konta: "+ this.balance);
    }
}
