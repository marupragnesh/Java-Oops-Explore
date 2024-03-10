package java_overloading;//import org.w3c.dom.ls.LSOutput;

class o1{
    void show(){
        System.out.println("show in java_overloading.o1");
    }
}

interface o3{
    void show();
}

class o2 extends o1 implements  o3{

   public void show() {
        super.show();
        System.out.println("this is implimentation of java_overloading.o3 show method");
    }

//    void show(){
//        System.out.println("show in java_overloading.o2");
//    }

    // if i above code is uncommented than it will first call " show in java_overloading.o2 " or may if not found than
    // call java_overloading.o1 class method
}

public class overloading1 {
    public static void main(String[] args) {
        o1 obj = new o2();
        obj.show();

    }
}
