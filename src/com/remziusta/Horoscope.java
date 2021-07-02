package com.remziusta;

import java.time.LocalDate;
import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Doğum tarihiniz (Yıl-Ay-Gün) :");
        String birthDate = sc.next();

        LocalDate ldDate = LocalDate.parse(birthDate);

        if(ldDate.getDayOfYear() >= LocalDate.parse("2020-03-21").getDayOfYear() && ldDate.getDayOfYear() <= LocalDate.parse("2020-04-20").getDayOfYear()){
            System.out.println("Koç Burcu");
        }else if(ldDate.getDayOfYear() >= LocalDate.parse("2020-04-21").getDayOfYear() && ldDate.getDayOfYear() <= LocalDate.parse("2020-05-21").getDayOfYear()){
            System.out.println("Boğa Burcu");
        }else if(ldDate.getDayOfYear() >= LocalDate.parse("2020-05-22").getDayOfYear() && ldDate.getDayOfYear() <= LocalDate.parse("2020-06-22").getDayOfYear()){
            System.out.println("İkizler Burcu");
        }else if(ldDate.getDayOfYear() >= LocalDate.parse("2020-06-23").getDayOfYear() && ldDate.getDayOfYear() <= LocalDate.parse("2020-07-22").getDayOfYear()){
            System.out.println("Yengeç Burcu");
        }else if(ldDate.getDayOfYear() >= LocalDate.parse("2020-07-23").getDayOfYear() && ldDate.getDayOfYear() <= LocalDate.parse("2020-08-22").getDayOfYear()){
            System.out.println("Aslan Burcu");
        }else if(ldDate.getDayOfYear() >= LocalDate.parse("2020-08-23").getDayOfYear() && ldDate.getDayOfYear() <= LocalDate.parse("2020-09-22").getDayOfYear()){
            System.out.println("Başak Burcu");
        }else if(ldDate.getDayOfYear() >= LocalDate.parse("2020-09-23").getDayOfYear() && ldDate.getDayOfYear() <= LocalDate.parse("2020-10-22").getDayOfYear()){
            System.out.println("Terazi Burcu");
        }else if(ldDate.getDayOfYear() >= LocalDate.parse("2020-10-23").getDayOfYear() && ldDate.getDayOfYear() <= LocalDate.parse("2020-11-21").getDayOfYear()){
            System.out.println("Akrep Burcu");
        }else if(ldDate.getDayOfYear() >= LocalDate.parse("2020-11-22").getDayOfYear() && ldDate.getDayOfYear() <= LocalDate.parse("2020-12-21").getDayOfYear()){
            System.out.println("Yay Burcu");
        }else if(ldDate.getDayOfYear() >= LocalDate.parse("2020-12-22").getDayOfYear() && ldDate.getDayOfYear() <= LocalDate.parse("2020-01-21").getDayOfYear()){
            System.out.println("Oğlak Burcu");
        }else if(ldDate.getDayOfYear() >= LocalDate.parse("2020-01-22").getDayOfYear() && ldDate.getDayOfYear() <= LocalDate.parse("2020-02-19").getDayOfYear()){
            System.out.println("Kova Burcu");
        }else if(ldDate.getDayOfYear() >= LocalDate.parse("2020-02-20").getDayOfYear() && ldDate.getDayOfYear() <= LocalDate.parse("2020-03-20").getDayOfYear()){
            System.out.println("Balık Burcu");
        }       
        
    }
}
