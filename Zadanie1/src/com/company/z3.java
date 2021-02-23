package com.company;
import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stopnie Celsjusza:");
        int cel = scanner.nextInt();
        System.out.println(1.8 * cel + 32);
    }
}
