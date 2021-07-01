package com.remziusta;

import java.util.Scanner;

public class ClassPassStatus {
    
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;
       Scanner sc = new Scanner(System.in);

       System.out.print("Matematik notunuz : " ); mat = sc.nextInt();
       System.out.print("Fizik notunuz : " ); fizik = sc.nextInt();
       System.out.print("Kimya notunuz : " ); kimya = sc.nextInt();
       System.out.print("Türkçe notunuz : " ); turkce = sc.nextInt();
       System.out.print("İngilizce notunuz : " ); muzik = sc.nextInt();

       int toplam = 0;
       if(mat > 0 && mat  < 100 && fizik > 0 && fizik  < 100 && kimya > 0 && kimya  < 100 && turkce > 0 && turkce  < 100 && muzik > 0 && muzik  < 100)
       {
        toplam = mat + fizik + kimya + turkce + muzik;
       }     
       else{
            System.out.println("Girdiğini değerler 0 ve 100 arasında olmalı...");
            System.exit(1); 
       }
               
       float ort = toplam / 5.0f;

       System.out.println("Ortalamanız : " + ort + " Durum : " + (ort>55?"Geçti":"Kaldı") );
    }
}
