package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class z6 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj Liczbe na pozycji." + i);
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);

        }
    }
}
