package com.remziusta;

import java.util.Scanner;

public class KdvTutarı {
    public static void main(String[] args) {

        float fiyat;
        Scanner sc = new Scanner(System.in);
        System.out.print("ürün Tutarını Girin : "); fiyat = sc.nextFloat();
        if (fiyat > 0 && fiyat <= 1000){
            System.out.println("Ürün için ödenecek : " + fiyat * 0.18);
        }
        if (fiyat > 1000){
            System.out.println("Ürün için ödenecek kdv tutarı : " + fiyat * 0.08);
        }
    }
}
