package java_annonymous_important;

// annonyous class also known as object with body
// it is used for change the bahaviour of method
// normally extend the class and override the method and change it
// also it saves the memory
// and we need to create interface objecct with that object having body.
class A{
    void abc(){
        System.out.println("this is abc");
    }
    static void xyz(){
        System.out.println("this is xyz");
    }
}
abstract class B {
    abstract public void mvc();
}
public class AnoClass {
    public static void main(String[] args) {
        A a1 = new A(){
            public void abc(){
                xyz();
                System.out.println("this is new abc ");
            }
        };
        a1.abc();   // <- this line is not calling
        A.xyz();
        A.xyz();


        B b1 = new B() {
            @Override
            public void mvc() {
                System.out.println("this is annonyous abstract class");
            }
        };

    }

}
