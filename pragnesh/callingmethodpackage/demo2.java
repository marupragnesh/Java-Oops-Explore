package callingmethodpackage;

import callingmethodpackage.calculator1;

public class demo2 {
    int u;
    int o;

    void minus(){
        // int c = 5 - 3;
        System.out.println("hii");
    }
    void obj(){
        calculator1 c1 = new calculator1();
     int s = c1.addition(3, 4);
        System.out.println(s);
    }
    public static void main(String[] args) {
        demo2 d = new demo2();
        d.minus();
        d.obj();      
    }
}
