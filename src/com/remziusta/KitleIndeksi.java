package com.remziusta;

import java.util.Scanner;

public class KitleIndeksi {
    public static void main(String[] args) {
        float kilo, boy;

        Scanner sc = new Scanner(System.in);
        System.out.print("Kilonuz : "); kilo = sc.nextFloat();
        System.out.print("Boyunuz (metre cinsinden) giriniz : "); boy = sc.nextFloat();

        System.out.println("Vücut Kitle indeksiniz : " + (kilo / (boy * boy)));
    }
}
