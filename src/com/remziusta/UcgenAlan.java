package com.remziusta;

import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float karsiKenar, komsuKenar, hipotenusKenar, u;

        System.out.print("Karşı Kenar Uzunluğu : "); karsiKenar = sc.nextFloat();
        System.out.print("Komşu Kenar Uzunluğu : "); komsuKenar = sc.nextFloat();
        System.out.print("Hipotenüs Kenar Uzunluğu : "); hipotenusKenar = sc.nextFloat();
        sc.close();

        u = (karsiKenar + komsuKenar + hipotenusKenar) / 2.0f;

        System.out.println("Üçgenin çevresi : " + (2 * u));

        double alan = (u * (u - karsiKenar)* (u - komsuKenar) * (u-hipotenusKenar));

        System.out.println("Üçgenin alanı : " + Math.sqrt(alan));

    }
}
