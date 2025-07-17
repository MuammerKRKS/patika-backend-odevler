package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısı : ");
        int a = scanner.nextInt();
        for (int i = a; i > 0; i--){
            // boşlukları yazdır
            for (int j = 0; j < a - i; j++){
                System.out.print(" ");
            }
                // yıldızları yazdır
                    for (int k = 0; k < i; k++){
                        System.out.print("*");
                    }
            System.out.println();
        }


    }
}