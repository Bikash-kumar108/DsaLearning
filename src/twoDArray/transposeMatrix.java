package twoDArray;

import java.util.Scanner;

public class transposeMatrix {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transposeMatrix(int[][] matrix, int rows, int cols) {
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number of rows:");
            int rows = sc.nextInt();
            System.out.println("Enter number of columns:");
            int cols = sc.nextInt();
            int[][] matrix = new int[rows][cols];

            System.out.println("Enter the matrix values:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println("Original Matrix:");
            printMatrix(matrix);

            int[][] transposedMatrix = transposeMatrix(matrix, rows, cols);
            System.out.println("Transposed Matrix:");
            printMatrix(transposedMatrix);
        }
        finally {
            sc.close();
        }
    }
}
