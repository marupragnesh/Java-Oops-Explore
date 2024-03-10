package java_my_collection.collection;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Comparotor1 {



    public static void main(String[] args) {
        List<String > l1 = Arrays.asList("B","A","Abhay","D","a","C");






//        l1.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//
        l1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println(o1+" "+o2);
                return o1.compareTo(o2);
            }
        });

        int[] salaries = {20000,25000,1000,33333,2222};

        //find highest salary

        //fins minimum salary

        //find salary greater than 23000

//        System.out.println(l1);
            Arrays.sort(salaries);

    }
}
