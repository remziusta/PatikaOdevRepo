package com.remziusta;

import java.util.Scanner;

public class ManavKasa {
    private static final float ARMUT_UCRET = 2.14f;
    private static final float ELMA_UCRET = 3.67f;
    private static final float DOMATES_UCRET = 1.11f;
    private static final float MUZ_UCRET = 0.95f;
    private static final float PATLICAN_UCRET = 5.00f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tutar = 0;
        int kilo;
        System.out.print("Armut kaç kilo ? "); kilo = sc.nextInt();
        tutar += kilo * ARMUT_UCRET;
        System.out.print("Elma kaç kilo ? "); kilo = sc.nextInt();
        tutar += kilo * ELMA_UCRET;
        System.out.print("Domates kaç kilo ? "); kilo = sc.nextInt();
        tutar += kilo * DOMATES_UCRET;
        System.out.print("Muz kaç kilo ? "); kilo = sc.nextInt();
        tutar += kilo * MUZ_UCRET;
        System.out.print("Armut kaç kilo ? "); kilo = sc.nextInt();
        tutar += kilo * PATLICAN_UCRET;


        System.out.println("Toplam tutar : " + tutar);
    }
}
