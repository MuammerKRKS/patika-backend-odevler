3 ve 4'e Tam Bölünen Sayıların Ortalamasını Hesaplama Programı

📋 Ödev Açıklaması
Bu Java programı, kullanıcıdan pozitif bir sayı alarak
0'dan girilen sayıya kadar olan sayıların içinde
hem 3'e hem de 4'e tam bölünen sayıların ortalamasını hesaplar.

🛠️ Kullanılan Yöntemler
Scanner sınıfı ile kullanıcıdan veri alma

for döngüsü ile 1’den girilen sayıya kadar olan sayıları kontrol etme

if kontrolü ile hem 3’e hem de 4’e bölünenleri bulma

Bulunan sayıların toplamını ve adedini sayma

Ortalama hesaplama ve sonucu ekrana yazdırma

📄 Örnek Kod


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int total = 0;
        int piece = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                piece++;
            }
        }

        if (piece > 0) {
            double average = (double) total / piece;
            System.out.println("Ortalama: " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }
    }
}


🎯 Amaç
Döngüler ve koşullar konusunu pekiştirmek

Temel aritmetik işlemleri pratik etmek

Java'da kullanıcıdan veri alma ve işlem yapma pratiği
