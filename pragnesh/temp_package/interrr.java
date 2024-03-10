package temp_package;

interface demo{
     void abc();
    // default void show(){
    //     System.out.println("in temp_package.demo show");
    // }
}

interface mydemo{
    void abc();
    // default void show(){
    //     System.out.println("In temp_package.mydemo");
    // }
}

class demoimp implements demo , mydemo{

 
    // public void abc(){
    //     System.out.println("in abc");
    // }
    // public void show(){
    //     temp_package.mydemo.super.show();
    // }
// @Override
public void abc() {
    
    System.out.println("hello abc");
   
}
public void xyz(){
    System.out.println(" hii xyz");
}
   
}

public class interrr {
    public static void main(String[] args) {
        // temp_package.demo obj = new temp_package.demoimp();
        // obj.abc();
        // obj.show();  
        demo obj = new demoimp();
        obj.abc();
        // obj.xyz(); error

        demoimp ip = new demoimp();
        ip.abc();
        ip.xyz();
    }
        
}
