package Array;
import java.util.Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Reavarsing {

    static void swap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : a , b");
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println("swap two number "+ a +" "+ b);
    }

    static void swaps(){ //without using making temp
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : a , b");
        int  a = sc.nextInt();
        int  b = sc.nextInt();

        a =a+b;
        b=a-b;
        a=a-b;
        System.out.println("swap two number "+ a +" "+ b);
    }
    static void reverse(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array");
        int[] arr ={1,2,3,4,5,6,7,8,9};


        int[] ans = new int[arr.length];
        int j =0;
        for(int i=arr.length-1;i>=0;i--){
            ans[j] = arr[i];
            j++;
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    static void inPlaceRevearse(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int i =0;
        int j = arr.length-1;
        while( i<j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }

    static int[] rotate(int[] arr , int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j =0;
        for(int i=n-k;i<n-1; i++){
            ans[j] = arr[i];

        }
        for(int i=0;i<n-k-1;i++){
            ans[j] = arr[i];

        }

        return ans;


    }



    


    public static void main(String[] args) {

//        swap();
//        swaps();
//        reverse();
//        inPlaceRevearse();
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the k :");
        int k = sc.nextInt();
//        rotate(arr,k);
        System.out.println(Arrays.toString(rotate(arr,k)));
    }


//


}
