package Array;
import java.util.Scanner;

public class targetSum {
    static int targetSum(int[] arr , int target){

        int n = arr.length;
        int count = 0;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]+arr[j] == target){
                    count++;
                }


            }

        }
        return count;

    }

    static int triplets(int[] arr , int target){
        int n = arr.length;
        int count = 0;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static int unique(int[] arr ){

        int n = arr.length;

        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] ==arr[j]){
                    arr[i] =-1;
                    arr[j] =-1;

                }

            }

        }
        int ans =-1;
        for(int i =0; i<n; i++){
            if(arr[i] >0){
                ans = arr[i];
            }
        }
        return ans;

    }

    static int findMax(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int secondMax(int[] arr){
        int n = arr.length;
        int max =findMax(arr);
        for(int i =0; i<n; i++){
            if(arr[i] ==max){
                arr[i] =Integer.MIN_VALUE;
            }
        }
        int secondMax =findMax(arr);
        return secondMax;
    }

    static int findFirstRepatingNum(int[] arr ){
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter all the elements in the array :"+ n);

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();

        }


//        System.out.println("enter the target element");
//        int target = sc.nextInt();

//        System.out.println(targetSum(arr,target));
//        System.out.println(triplets(arr,target));
//        System.out.println(unique(arr));

//        System.out.println(findMax(arr));
//        System.out.println(secondMax(arr));
//        System.out.println(findFirstRepatingNum(arr));




    }
}
