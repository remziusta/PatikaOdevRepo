package com.remziusta;

import java.util.Scanner;

public class Ortalama {

   public static void main(String[] args) {
       int mat, fizik, kimya, biyoloji, ingilizce, geo;
       Scanner sc = new Scanner(System.in);

       System.out.print("Matematik notunuz : " ); mat = sc.nextInt();
       System.out.print("Fizik notunuz : " ); fizik = sc.nextInt();
       System.out.print("Kimya notunuz : " ); kimya = sc.nextInt();
       System.out.print("Biyoloji notunuz : " ); biyoloji = sc.nextInt();
       System.out.print("İngilizce notunuz : " ); ingilizce = sc.nextInt();
       System.out.print("Geometri notunuz : " ); geo = sc.nextInt();

       int toplam = mat + fizik + kimya + biyoloji + ingilizce + geo;
       float ort = toplam / 6.0f;

       System.out.println("Ortalamanız : " + ort + " Durum : " + (ort>60?"Geçti":"Kaldı") );
       System.out.println();
   }
}
