package java_my_collection.collection;

import java.util.ArrayList;
import java.util.List;

// get , contain , size, remove , removeall , add, add with indexnumber , set (replace the value)
// two ways to define - set and unset list -> durgesh --> screen shot
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        List<Double> D1 = new ArrayList<>();
        List<Float> F1 = new ArrayList<>();
        ArrayList<String>  a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();

        a1.add(5);
        a1.add(11);
        a1.add(12);
        a1.add(13);
        a1.add(14);
        a1.add(15);
        a1.add(16);
        a1.add(17);
        a1.add(18);
        D1.add(6344.2880);
//    F1.add(12.245);
        a2.add("pragnesh");
        a2.add("pintu");
        a3.add(9);
        // you can add only same type of arraylist
        a1.add(1,7);
        System.out.println(a1);
        a1.addAll(a3);
        System.out.println(a1);

        System.out.println(a1);
        System.out.println(a1.get(1));
        System.out.println("----------");
            a1.remove(1);
        System.out.println(a1);
//        System.out.println(a1);

       a1.remove(Integer.valueOf(9));
        System.out.println(a1);
//        System.out.println(a1.remove(String.valueOf(9)));
            a2.remove("pragnesh");
        System.out.println(a2);


        a2.set(0,"pragnesh");

        System.out.println(a2);
//        a2.contains("pragnesh");
        System.out.println(a2.contains("pragnesh"));// works only sout
//        a1.clear(); // empty list
        System.out.println(a1);

        for (int i = 0; i <a1.size() ; i++) {
            System.out.print(" "+a1.get(i));
        }
        System.out.println("--------------------");
        for(Integer element : a1){
            System.out.print(" "+element);
        }
    }
}
