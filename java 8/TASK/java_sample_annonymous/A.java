package java_sample_annonymous;

// super keyword is defalut work in extended class
// go to interview question
class A1{
    int i;
    A1(int j){
        System.out.println("hi");
    }

    A1(String s){
        super(); // it is not calling int j constructor
        System.out.println("hello");

    }
}

public class A {
    public static void main(String[] args) {

        A1 n1 = new A1("pragnesh");
    }
}