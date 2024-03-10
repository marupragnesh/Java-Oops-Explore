package java_super;

class x {

    x(){
        System.out.println("java_super.x");
    }

    x(int a){
        System.out.println(" java_super.x with parameter");
    }

}
class y extends x{

    y(){
        System.out.println("java_super.y");
    }
    y(int j, int k){
        super();

        System.out.println(j+k);
    }
    y(int a){
//        super();
        this(5,5);

        System.out.println("java_super.y with paramater");
    }
}

public class super1 {
    public static void main(String[] args) {
//        java_super.y obj1 = new java_super.y();  uncomment and guess the output and also matter sequence
        y obj = new y(3);

    }
}
