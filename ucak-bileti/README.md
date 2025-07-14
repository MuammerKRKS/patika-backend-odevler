# Uçak Bileti Fiyat Hesaplama

Bu Java programı, kullanıcının girdiği mesafe, yaş ve yolculuk tipine göre uçak bileti fiyatını hesaplar ve uygun indirimleri uygular.

## Özellikler
- Mesafe başına ücret: **0.10 TL/km**
- Yaş İndirimleri:
  - 12 yaş altı: **%50 indirim**
  - 12-24 yaş arası: **%10 indirim**
  - 65 yaş üstü: **%30 indirim**
- Gidiş-Dönüş Biletlerinde: **%20 indirim**  
  (İndirim sonrası fiyat **2 ile çarpılır**)

## Kullanıcıdan Alınan Bilgiler
- Mesafe (KM)
- Yaş
- Yolculuk Tipi (1 => Tek Yön, 2 => Gidiş Dönüş)

## Hatalı Giriş Kontrolü
- Mesafe ve yaş **pozitif** olmalıdır.
- Yolculuk tipi sadece **1** veya **2** olmalıdır.  
Yanlış veri girilirse kullanıcıya uyarı mesajı verilir.

## Örnek Çalışma
Mesafeyi km cinsinden giriniz:
500
Yaşınızı giriniz:
20
Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş):
2
Toplam bilet fiyatı: 72.00 TL


