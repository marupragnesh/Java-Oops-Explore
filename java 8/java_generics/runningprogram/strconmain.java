package java_generics.runningprogram;

import java_generics.runningprogram.strcon;

public class strconmain {
    public static void main(String[] args) {


        strcon<String,String> ss = new strcon<>("hello","hii");
        String concate = ss.objs1+ss.objs2;
        System.out.println(concate);
    }
}