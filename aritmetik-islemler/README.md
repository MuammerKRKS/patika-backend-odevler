# İşlem Önceliği Örneği - Java

Bu program, Java dilinde işlem önceliğine göre verilen sayılar üzerinde matematiksel işlem yapar ve sonucu ekrana yazdırır.

## Açıklama
Programda sabit olarak verilen üç sayı (`a`, `b`, `c`) aşağıdaki işlem sırasına göre hesaplanır:
```
a + b * c - b
```
Java’da işlem önceliği kuralları gereği:
- Önce çarpma yapılır,
- Sonra toplama ve çıkarma yapılır.

### Örnek
```java
int a = 10;
int b = 2;
int c = 3;

int sonuc = a + b * c - b;
System.out.println("sonuc: " + sonuc);
```

**Çıktı:**
```
sonuc: 14
```

## Çalıştırmak İçin
1. Java IDE (IntelliJ IDEA, Eclipse) ya da terminal kullanabilirsiniz.
2. `Main.java` dosyasını oluşturup yukarıdaki kodu yapıştırın.
3. Çalıştırın ve sonucu görün!

## Not
Eğer kullanıcıdan sayı almak isterseniz `Scanner` sınıfını kullanabilirsiniz.
