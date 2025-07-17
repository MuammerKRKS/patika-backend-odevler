Ters Üçgen Çizimi — Java Uygulaması
📋 Ödev Konusu
Kullanıcıdan alınan basamak sayısına göre, yıldız (*) karakterleri kullanarak sola yaslı ters üçgen çizen Java programı.

💻 Kullanılan Yapılar
Scanner sınıfı ile kullanıcıdan veri alma

İç içe for döngüsü kullanarak yıldızları yazdırma

Her satırda yıldız sayısını bir azaltarak ters üçgen şekli oluşturma


📝 Örnek Kullanım

Basamak sayısı : 5
*****
****
***
**
*


📌 Kodun Mantığı
Dış döngü: Satırları kontrol eder

İç döngü: Her satırda yıldızları yan yana yazar

Her satırda yıldız sayısı bir azaltılır

🛠️ Kod

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısı : ");
        int a = scanner.nextInt();

        for (int i = a; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


🎯 Amaç
Döngü kullanarak şekil oluşturma mantığını geliştirmek

Kullanıcıdan veri alma ve çıktı verme pratiği kazanmak

