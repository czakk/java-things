package com.company;

import java.util.Scanner;
import java.util.Arrays;



public class z2 {
    public static int[] get_array() {

        int x = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy: ");
        int size = scan.nextInt();
        System.out.println("Podaj wartosc pierwszej pozycji: ");
        int value = scan.nextInt();
        int[] array = new int[size];
        array[0] = value;

        while (x < size){
            for (int j = 1;j < size*size;j++){
                if ((j > value) && (j > array[x-1]) && (j%2 == 0)){
                    array[x] = j;
                    x++;
                    break;
                }
            }

        }

        return array;
    }
    public static int min(int[] array){
        int min = array[0];

        for (int i: array){
            if (i < min){
                min = i;
            }
        }
        return min;
    }

    public static int max(int[] array){
        int max = array[0];
        for (int i: array){
            if (i > max){
                max = i;
            }
        }
        return max;
    }

    public static int sum(int[] array){
        int sum = 0;
        for (int i: array){
            sum += i;
        }
        return sum;
    }

    public static double average(int[] array){
        double sum = 0;
        for (double i: array){
            sum += i;
        }
        return sum / array.length;
    }

    public static int median(int[] array){
        Arrays.sort(array);
        int median = 0;
        if (array.length % 2 == 0){
           int x = array[(array.length / 2)-1],y = array[(array.length / 2)];
           median = (x+y) / 2;
        }
        else{
            median = array[(array.length / 2)] ;
        }


        return median;
    }



    public static void main(String[] args) {
        int[] array = get_array();
        System.out.println("Twoja tablica: "+Arrays.toString(array));
        System.out.println("Min: "+min(array));
        System.out.println("Max: "+max(array));
        System.out.println("Sum: "+sum(array));
        System.out.println("Avg: "+average(array));
        System.out.println("Mdn: "+median(array));
    }
}