package twoDArray;

import java.util.Scanner;

public class matrixArray {

    static void printMatrix(int[][] Matrix){

        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[i].length;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    static void add(int[][] a, int rows1, int cols1,int[][] b, int rows2, int cols2){
        if(rows1!=rows2 || cols1!=cols2){
            System.out.println("number of rows and cols is not equal so addition is not posible");
            return;
        }
        int[][] sum = new int[rows1][cols1];
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("sum of Matrix 1 and Matrix2");
        printMatrix(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows1");
        int rows1 = sc.nextInt();
        System.out.println("Enter cols1");
        int cols1 = sc.nextInt();
        int[][] a = new int[rows1][cols1];
        System.out.println("Enter matrix value");
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols1;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter rows2");
        int rows2 = sc.nextInt();
        System.out.println("Enter cols2");
        int cols2 = sc.nextInt();
        int[][] b = new int[rows2][cols2];
        System.out.println("Enter matrix value");
        for(int i=0;i<rows2;i++){
            for(int j=0;j<cols2;j++){
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix 1");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);

        add(a,rows1,cols1,b,rows2,cols2);

    }
}
