package com.remziusta;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("İlk Sayınız : ");
        int first = sc.nextInt();
        System.out.print("İkinci Sayınız : ");
        int second = sc.nextInt();

        
        System.out.println("Çarpma - > *");
        System.out.println("Bölme - > /");
        System.out.println("Toplama - > +");
        System.out.println("Çıkarma - > -"); 
        System.out.print("İşleminizi seçin :");
        String y =  sc.next();
        sc.close();

        switch (y.charAt(0)) {
            case '*':
                System.out.println("Sonuç : " + first * second);
                break;
            case '/':
                if(first > second ) System.out.println("Sonuç : " + first / second);
                break;
            case '+':
                System.out.println("Sonuç : " + (first + second));
                break;
            case '-':
                System.out.println("Sonuç : " + (first - second));
                break;
            default:
                System.out.println("Geçerli bir işlem seçiniz...");
                break;
        }
    }
}