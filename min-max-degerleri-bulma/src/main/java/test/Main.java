package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı adeti: ");
        int number = scanner.nextInt();

        System.out.println("Birinci Sayıyı Giriniz: ");
        int num1= scanner.nextInt();

        int min = num1;
        int max = num1;

        for (int i = 2; i <=number ; i++) {
            System.out.println(i + " sayı girin: ");
            num1= scanner.nextInt();

            if(num1 < min){
                min =num1;
            }
            if(num1 > max){
                max=num1;
            }
        }
        System.out.println("Girilen En küçük sayı: " + min + " ve girilen en büyük sayı: " + max );
        scanner.close();
    }
}
