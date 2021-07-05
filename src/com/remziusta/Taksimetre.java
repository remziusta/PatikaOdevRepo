package com.remziusta;

import java.util.Scanner;

public class Taksimetre {

    private static final float KM_FOR_PRICE = 2.20f;

    private static final float START_TAXIMETER_PRICE = 10.0f;


    public static void main(String[] args) {
        float kilometer, totalPrice;

        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç km yolculuk edildi : "); kilometer = sc.nextFloat();
        sc.close();

        totalPrice = kilometer * KM_FOR_PRICE + START_TAXIMETER_PRICE;

        if(totalPrice < 20)
            System.out.println("Ödemeniz gereken tutar : 20 ₺");
        else
            System.out.println("Ödemeniz gereken tutar : " + totalPrice + " ₺");


    }
}
