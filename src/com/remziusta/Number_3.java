package com.remziusta;

import java.util.Scanner;

public class Number_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = sc.nextInt();
        
        for (int i = 1; i < number; i++) {
            if(i % 5 == 0 || i % 4 == 0){
                System.out.println(i);
            }
        }
    }
}
