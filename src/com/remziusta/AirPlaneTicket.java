package com.remziusta;

import java.util.Scanner;

public class AirPlaneTicket {
    public final static float price = 0.10f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mesafe(KM) : ");
        int km = Short.parseShort(sc.next());
        System.out.print("Yaşınız : ");
        short age = Short.parseShort(sc.next());
        System.out.println("Yolculuk tipi : ");
        System.out.println("1 - Tek yön 2- Gidiş-Dönüş");
        int types = Short.parseShort(sc.next());

        if (age > -1 && km > -1 && (types == 1 || types == 2)) {
            float total = km * price;
            if (age < 12) {
                float ageDiscount = total * 0.50f;
                float totalDiscount = total - ageDiscount;
                if (types == 1) {
                    System.out.println("Toplam tutar : " + totalDiscount);
                }else{
                    float typeDiscount = totalDiscount * 0.20f;
                    System.out.println("Toplam tutar : " + (totalDiscount - typeDiscount) * 2);
                }
            }else if(age >= 12 && age <= 24){
                float ageDiscount = total * 0.10f;
                float totalDiscount = total - ageDiscount;
                if (types == 1) {
                    System.out.println("Toplam tutar : " + totalDiscount);
                }else{
                    float typeDiscount = totalDiscount * 0.20f;
                    System.out.println("Toplam tutar : " + (totalDiscount - typeDiscount) * 2);
                }
            }else if(age > 65){
                float ageDiscount = total * 0.30f;
                float totalDiscount = total - ageDiscount;
                if (types == 1) {
                    System.out.println("Toplam tutar : " + totalDiscount);
                }else{
                    float typeDiscount = totalDiscount * 0.20f;
                    System.out.println("Toplam tutar : " + (totalDiscount - typeDiscount) * 2);
                }
            }
        } else
            System.out.println("Hatalı veri girdiniz...");

    }
}
