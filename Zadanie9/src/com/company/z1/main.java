package com.company.z1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj imię");
            String name = scan.nextLine();
            System.out.println("Podaj nazwisko");
            String last_name = scan.nextLine();
            System.out.println("Podaj rok urodzenia");
            int birth_year = scan.nextInt();

            try {
                Person p = new Person(name, last_name, birth_year);
                System.out.println(p);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
