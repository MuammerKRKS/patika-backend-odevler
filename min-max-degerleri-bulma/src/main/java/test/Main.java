package test;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int total = 0;
        int piece = 0;

        for (int i = 1; i <= number; i++)
        {
            if ( i % 3 == 0 && i % 4 == 0)
            {
                total += i;
                piece++;
            }
        }
if (piece > 0 )
{
    double average = (double) total / piece;
    System.out.println("ortalama: " + average);
} else {
    System.out.println("3 ve 4'e tam bölünen sayı bulunamadı. ");
}

}

}
