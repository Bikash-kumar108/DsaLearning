package Array;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        System.out.println("Enter a size of arr");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        System.out.println("Enter the arr");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }


        for(int i = 0; i<arr.length; i++){
            System.out.print(  arr[i]+" ");
        }


    }
}
