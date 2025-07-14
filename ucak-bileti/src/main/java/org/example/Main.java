package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz: ");
        double mesafe = scanner.nextDouble();

        System.out.println("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int tip = scanner.nextInt();

        if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı veri girdiniz!");
        } else {
            double birimFiyat = 0.10;
            double toplamFiyat = mesafe * birimFiyat;

            // Yaş indirimi
            if (yas < 12) {
                toplamFiyat *= 0.5;
            } else if (yas <= 24) {
                toplamFiyat *= 0.9;
            } else if (yas > 65) {
                toplamFiyat *= 0.7;
            }

            // Yolculuk tipi indirimi
            if (tip == 2) {
                toplamFiyat *= 0.8;
                toplamFiyat *= 2;
            }

            System.out.printf("Toplam bilet fiyatı: %.2f TL%n", toplamFiyat);
        }

        scanner.close();
    }
}
