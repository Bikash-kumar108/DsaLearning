package Array;

public class changeArray {

    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=0;

        }

    }
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        changeArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
