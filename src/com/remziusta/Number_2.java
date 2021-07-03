package com.remziusta;

import java.util.Scanner;

public class Number_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        while(true) {
            System.out.print("Bir sayı giriniz : ");
            int number = sc.nextInt();
            if(number % 2 != 0){
                break;
            }else if(number % 2 == 0 && number % 4 == 0){
                total += number;
            }
            
        }

        System.out.println("Girdiğiniz değerlerden çifte ve 4' e kalansız bölünen sayılar toplamı : " + total);
        
    }
}
