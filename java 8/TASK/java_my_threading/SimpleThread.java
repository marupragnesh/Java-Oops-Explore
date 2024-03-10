package java_my_threading;

// practice of reference variable
// we create interface reference variable , so can we same as create class reference variable
// asn : yes and its work like interface reference.
// also called as dynamic method dispatch.
interface PracticeThread {

       default void mymethod(){
            System.out.println("hellow");

        }

}
class PracticeThread1 implements PracticeThread {
     void mymethod1()
    {
        System.out.println("hoo");
    }

}

class PracticeThread3 {

     void mymethod(){
        System.out.println("hellow practice with no parameter ");

    }

    void mymethod(int a){
        System.out.println("hellow practice having parameter ");

    }



}
class PracticeThread4 extends PracticeThread3 {
//    void mymethod(){
//        System.out.println("hellow practice ");
//
//    }

}

class PracticeThread5 extends Thread {

    void mymethod(){
        System.out.println("hellow thread ");

    }

   public void run(){
        System.out.println("hellow thread ");

    }


}
class PracticeThread6 extends Thread {
    void mymethod(){
        System.out.println("hii thread ");



    }

}

public class SimpleThread {
    public static void main(String[] args) {
        PracticeThread p1 = new PracticeThread1();
        p1.mymethod();

        PracticeThread3 p3 = new PracticeThread4();
        p3.mymethod();
        p3.mymethod(34);

    }
}
