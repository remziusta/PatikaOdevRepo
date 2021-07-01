package com.remziusta;

import java.util.Scanner;

public class ActivityHot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz : ");
        int hot = sc.nextInt();

        if(hot <= 5){
            System.out.println("Kayak");
        }else if(hot > 5 && hot <= 15){
            System.out.println("Sinema");
        }else if(hot > 15 && hot <= 25 ){
            System.out.println("Piknik");
        }else if(hot > 25){
            System.out.println("Yüzme");
        }
    }
}
