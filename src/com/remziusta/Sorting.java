package com.remziusta;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[3];
        int k;
        for(int i = 0; i < 3; i++){
            System.out.print(i + 1 + ". sayıyı giriniz : ");
            array[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if(array[j] < array[i]){
                    k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }

    }
}
