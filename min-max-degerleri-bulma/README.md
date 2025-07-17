Kullanıcıdan Girilen Sayılar Arasından En Büyük ve En Küçük Sayıyı Bulan Program
📋 Ödev Açıklaması
Bu Java programı, kullanıcıdan belirli sayıda sayı alarak
bu sayılar arasından en küçük ve en büyük olanını bulur ve ekrana yazdırır.

🛠️ Kullanılan Yöntemler
Scanner sınıfı ile kullanıcıdan sayı alma

İlk girilen sayıyı başlangıç değeri olarak atama

for döngüsü ile diğer sayıların girişini kontrol etme

Koşul ifadeleri (if) kullanarak karşılaştırma

Minimum ve maksimum değeri belirleme


📄 Örnek Kod
import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı adeti: ");
        int number = scanner.nextInt();

        System.out.println("Birinci Sayıyı Giriniz: ");
        int num1 = scanner.nextInt();

        int min = num1;
        int max = num1;

        for (int i = 2; i <= number; i++) {
            System.out.println(i + ". sayıyı girin: ");
            num1 = scanner.nextInt();

            if (num1 < min) {
                min = num1;
            }
            if (num1 > max) {
                max = num1;
            }
        }

        System.out.println("Girilen En küçük sayı: " + min + " ve girilen En büyük sayı: " + max);
        scanner.close();
    }
}


📝 Örnek Çalıştırma

Sayı adeti:  
4  
Birinci Sayıyı Giriniz:  
10  
2. sayıyı girin:  
5  
3. sayıyı girin:  
20  
4. sayıyı girin:  
8  
Girilen En küçük sayı: 5 ve girilen En büyük sayı: 20  






🎯 Amaç
Döngülerle kullanıcıdan birden fazla veri almayı öğrenmek

Sayılar arasında karşılaştırma yapabilmek

Min-max algoritmasıyla temel kontrol yapıları kullanmak




