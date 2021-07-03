package com.remziusta;

import java.util.Scanner;

public class Number3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = sc.nextInt();
        int counter = 0;
        int total = 0;
        for (int i = 0; i < number; i++) {
            if(i % 3 == 0 && i % 4 == 0){
                counter++;
                total += i;
            }
        }
        
        System.out.println("Sonuç : " + total / counter);
    }
}
