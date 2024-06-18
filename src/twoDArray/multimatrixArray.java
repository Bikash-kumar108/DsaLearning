package twoDArray;

import java.util.Scanner;

public class multimatrixArray {
    static void printMatrix(int[][] Matrix){

        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[i].length;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }

    }


    static void multiply(int[][] a, int rows1, int cols1,int[][] b, int rows2, int cols2){
        if(cols1!=rows2 ){
            System.out.println("number of rows and cols is not equal so multiplication  is not posible");
            return;
        }
        int[][] mult = new int[rows1][cols2];
        for(int i=0;i<rows1;i++){ //row
            for(int j=0;j<cols2;j++){//cols
                for (int k=0;k<cols1;k++){
                    /*
                     mult
                     */
                    mult[i][j] +=a[i][k]*b[k][j];

                }



            }
        }
        System.out.println("mult of Matrix 1 and Matrix2");
        printMatrix(mult);
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

        multiply(a,rows1,cols1,b,rows2,cols2);

    }
}
