package com.company;

import java.util.Scanner;

public class Main {

    static boolean asalMi(int sayi) {

        int sayac = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        int sayac = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir say� giriniz : ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi)) {
            System.out.println("Girilen sayi asald�r.");
        } else {
            System.out.println("girilen say� asal de�ildir.");
        }
    }
}
