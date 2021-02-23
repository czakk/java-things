package com.company;
import java.util.Scanner;

public class z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj A:");
        int a = scanner.nextInt();
        System.out.println("Podaj B:");
        int b = scanner.nextInt();
        System.out.println("Podaj C:");
        int c = scanner.nextInt();

        if (a + b > c){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }
    }
}
