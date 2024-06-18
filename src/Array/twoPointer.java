package Array;

import java.util.Scanner;

public class twoPointer {
    static void printArray(int[] arr){
        int n = arr.length;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static  void sortZerosandOnes(int[] arr){
        int n = arr.length;
        int count =0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }

        for(int i=0;i<n;i++){
            if(i <count){
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("original array");
        printArray(arr);
        sortZerosandOnes(arr);
        System.out.println("sorted array");
        printArray(arr);

    }
}
