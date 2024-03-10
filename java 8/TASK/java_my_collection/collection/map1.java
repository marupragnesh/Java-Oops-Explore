package java_my_collection.collection;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// keys are unique if override the key then last value set default
public class map1 {
    public static void main(String[] args) {
        Map<String,Integer> var = new HashMap<>(); // big 0 1
        Map<String,Integer> var1 = new TreeMap<>(); // log - n
        var.put("pragnesh", 1);
        var.put("sachin",2);
        var.put("sachin1",2);
        var.put("sachin2",3);
        var.put("sachin3",4);
        var.put("sachin4",5);

        System.out.println(var);

//        var1.remove("sachine2");

        for (Map.Entry<String,Integer> e: var.entrySet())
        {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for(String key : var.keySet()){
            System.out.println(key);
        }
    }
}
