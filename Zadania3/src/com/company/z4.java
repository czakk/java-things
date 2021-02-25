package com.company;

public class z4 {
    public static int[][] array(){
        int n = 3;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                array[i][j] = i+j;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[][] array = array();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println("");
        }
    }

}
