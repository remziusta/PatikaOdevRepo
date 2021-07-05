package com.remziusta;

import java.util.Scanner;

public class ChinaZodiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Doğum Yılınız : ");
        int birthYear = sc.nextInt();
        sc.close();

        String[] zodiacArray = {
            "Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", 
            "Kaplan", "Tavşan", "Ejderha", "Yılan", "At","Koyun"};

        System.out.println("Çin Zodyağı Burcunuz : " + zodiacArray[birthYear % 12]);
    }
}
