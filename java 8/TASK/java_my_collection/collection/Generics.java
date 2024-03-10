package java_my_collection.collection;

import java.awt.image.Kernel;

public class Generics<K> {

   public K container=null;
    public Generics(K container){
        this.container = container;
    }


        public Object show(){
        return this.container;
    }



}
