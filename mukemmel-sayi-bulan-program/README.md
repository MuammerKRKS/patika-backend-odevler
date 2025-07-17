# Mükemmel Sayı Bulma Programı

Bu Java programı, kullanıcının girdiği sayının **mükemmel sayı** olup olmadığını kontrol eder.

## Mükemmel Sayı Nedir?

Bir sayının, **kendisi hariç** pozitif tam bölenlerinin toplamı kendisine eşitse o sayıya **mükemmel sayı** denir.

### Örnekler:
- **6** → Bölenleri: 1, 2, 3 → Toplam: 6 → ✅ Mükemmel sayıdır.  
- **28** → Bölenleri: 1, 2, 4, 7, 14 → Toplam: 28 → ✅ Mükemmel sayıdır.  
- **15** → Bölenleri: 1, 3, 5 → Toplam: 9 → ❌ Mükemmel sayı değildir.

---

## Kullanım

1. Java ortamında programı çalıştır.
2. Ekranda çıkan soruya pozitif bir tam sayı gir.
3. Program, sayının mükemmel olup olmadığını ekrana yazdırır.

---

## Örnek Çalışma

Bir sayı giriniz: 28
28 mükemmel bir sayıdır.

Bir sayı giriniz: 15
15 mükemmel bir sayı değildir.



---

## Koddan Kısa Bir Bölüm:
```java
for (int i = 1; i < number; i++) {
    if (number % i == 0) {
        total += i;
    }
}
if (total == number) {
    System.out.println(number + " mükemmel bir sayıdır.");
} else {
    System.out.println(number + " mükemmel bir sayı değildir.");
}
