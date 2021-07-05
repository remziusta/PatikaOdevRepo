package com.remziusta;

import java.util.Scanner;

public class DaireAlan {

    private final static float _PI = 3.14f;

    public static void main(String[] args) {
        float radius, angle, area;

        Scanner sc = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz :"); radius = sc.nextFloat();
        System.out.print("Açıyı giriniz :"); angle = sc.nextFloat();

        area = (_PI * (radius * radius) * angle)/360.0f;
        sc.close();

        System.out.println("Değerini girmiş olduğunuz daire diliminin alanı :" + area);

    }
}
