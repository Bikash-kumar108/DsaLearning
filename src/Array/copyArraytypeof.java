package Array;
import java.util.Arrays;

import java.lang.reflect.Array;

public class copyArraytypeof {
    public static void main(String[] args) {

//        iteration();
//        Clone();
        Copyof();

    }

    static void Copyof(){
        int[] a ={3,4,5,6,7,8,9};
        int[] b = Arrays.copyOf(a,a.length);
        b[0]=4;

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+ " ");
        }

    }

    static void Clone(){
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]+" ");
        }
    }

    static void iteration() {
        int[] a = {1, 2, 3, 4, 5};

        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            b[i] = a[i];
        }

        b[0] = 4;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");

        }


    }

}
