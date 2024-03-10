package java_other_core;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        for(int i=0; i<5; i++)
        {
            a1.add(i);
        }
        a1.remove(2);
        boolean b = a1.isEmpty();
    

        System.out.println(a1 +""+ b);


    }
}
