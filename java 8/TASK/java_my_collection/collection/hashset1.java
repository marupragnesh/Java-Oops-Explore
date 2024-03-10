package java_my_collection.collection;

// it is give output random
// it contain unique elements

// add , remove , contain check the elements present or not return boolean value, isempty check in hashset value
// is present or not , size, clear

import java.util.HashSet;
import java.util.Set;

// there are also set like linkedhashset and (treehash set)-> sorting order output
public class hashset1 {

    public static void main(String[] args) {
        Set<Integer> i = new HashSet<>();
        Set<student> s = new HashSet<>();
        i.add(6);
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);

        s.add(new student(6,"sachin"));
        s.add(new student(6,"soni"));
        s.add(new student(4,"ajay"));
        s.add(new student(1,"ajay"));
        s.add(new student(2,"rishabh"));

        System.out.println(" "+s);


    }

}
