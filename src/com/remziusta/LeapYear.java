package com.remziusta;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yıl : ");
        int year = sc.nextInt();
        
        if(year % 4 == 0 || year % 400 == 0) System.out.println(year + " artık yıldır.");
        else System.out.println(year + " artık yıl değildir.");

    }
}
