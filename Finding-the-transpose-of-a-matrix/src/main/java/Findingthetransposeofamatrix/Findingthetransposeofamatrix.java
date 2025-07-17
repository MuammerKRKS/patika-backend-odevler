package Findingthetransposeofamatrix;

import java.util.Scanner;

public class Findingthetransposeofamatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz: ");
        int row = scanner.nextInt();

        System.out.print("Sütun sayısını giriniz: ");
        int col = scanner.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Matris elemanlarını giriniz:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nGirilen Matris:");
        printMatrix(matrix);

        System.out.println("\nMatrisin Transpozu:");
        printMatrix(transpose(matrix));
    }

    // Matrisin transpozunu döndüren metot
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transposed = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        return transposed;
    }

    // Matrisi yazdıran metot
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
