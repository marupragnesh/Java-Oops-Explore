package java_my_collection;

import java.util.Arrays;

public class LearnArrayClass {

    public static void main(String[] args) {
        int a[] = {1,2,4,4,5,6,7,7,8} ;
   // return the index below line
        int index = Arrays.binarySearch(a,2); // it works when array is shorted // log n
        System.out.println(index );
        int b[] ={7,4,8,9,3,7,2,8};
        Arrays.sort(b);
//        System.out.println(b.toString());

        for(int i : b){
            System.out.print(i + " ");
        }
    }
}
