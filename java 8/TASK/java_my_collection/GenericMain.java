package java_my_collection;

import java_my_collection.collection.Generics;

public class GenericMain {
    public static void main(String[] args) {


        Generics g1 = new Generics('j');
//        System.out.println(g1.show());

      Generics<String> s1 = new Generics<>("hello pragnesh");
        System.out.println(s1.show());

        s1.container = "this is string";
        System.out.println(s1.container);

//     List <String> strings = new ArrayList<>();



    }
}
