package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++){ // kendisi hariç olduğu için < kullanıyoruz
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number){
            System.out.println(" Mükemmel bir sayıdır.");
        } else{
            System.out.println(" Mükemmel bir sayı değildir.");
        }
    }
}