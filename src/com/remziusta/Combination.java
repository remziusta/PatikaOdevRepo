package com.remziusta;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("İlk kümenin eleman sayısı : ");
        int n = sc.nextInt();
        System.out.print("İkinci kümenin eleman sayısı : ");
        int r = sc.nextInt();
        int combinationResult = factorialCalculator(n) / (factorialCalculator(r) * factorialCalculator(n - r));
        System.out.println("İki kümenin kombinasyon sayısı : " + combinationResult);
        sc.close();

    }

    public static int factorialCalculator(int k){
        int result = 1;
        for (int i = 1; i <= k; i++) {
            result *= i;
        }
        return result;
    }
}
