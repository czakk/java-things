package com.company;
import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i=0; i < size;i++){
            System.out.println("Podaj liczbe na pozycji ["+i+"]");
            array[i] = scan.nextInt();
        }


        for (int x : array){
            System.out.println(x);
        }

    }
}
