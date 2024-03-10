package java_my_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LearnCollectionClass1 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(21);
        l1.add(22);
        l1.add(23);
        l1.add(24);
        l1.add(25);
        l1.add(26);

        System.out.println(" "+ Collections.min(l1));
        // same as use for max , sort   , l1,comparotor.reverseOrder()
    }
}
