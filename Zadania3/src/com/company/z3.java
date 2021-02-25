package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class z3 {
    public static int[] adding(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc macierzy: ");
        int size = scan.nextInt();
        int[] array1 = new int[size], array2 = new int[size], array3 = new int[size];

        for (int i=0; i < size;i++){
            System.out.println("Podaj liczbe na pozycji array1["+i+"]");
            array1[i] = scan.nextInt();
        }
        for (int i=0; i < size;i++){
            System.out.println("Podaj liczbe na pozycji array2["+i+"]");
            array2[i] = scan.nextInt();
        }
        for (int i=0; i < size;i++){
            array3[i] = array1[i] + array2[i];
        }
        return array3;
    }
    public static void main(String[] args) {
        System.out.print("Wynik: "+Arrays.toString(adding()));
    }
}
