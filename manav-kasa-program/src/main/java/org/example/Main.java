package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut kaç kilo? ");
        double armutkg = scanner.nextDouble();

        System.out.println("Elma kaç kilo? ");
        double elmakg = scanner.nextDouble();

        System.out.println("Muz kaç kilo? ");
        double muzkg = scanner.nextDouble();

        System.out.println("Domates kaç kilo? ");
        double domateskg = scanner.nextDouble();

        System.out.println("Patlıcan kaç kilo? ");
        double patlıcankg = scanner.nextDouble();

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double muzFiyat = 0.95;
        double domatesFiyat = 1.11;
        double patlicanFiyat = 5.00;

        double toplam = armutkg * armutFiyat + elmakg * elmaFiyat + muzkg * muzFiyat + domateskg * domatesFiyat + patlıcankg * patlicanFiyat;
        System.out.println("Toplam Tutar: " + toplam + "TL");
    }
}