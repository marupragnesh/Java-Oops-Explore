package java_new_inter2;

interface i2{
    void show1();
    void notshow1();

    default void where(){
        System.out.println("where are you");
    }
}

class c  implements i2 {
   public void show1(){
        System.out.println("hellow");
    }
   public void notshow1() {
       System.out.println("not hellow");
   }

        public void where(){
           System.out.println("what are you doing");
       }

}
public class myinterface2 {
    public static void main(String[] args) {
        i2 obj = new c();
        obj.show1();
        obj.notshow1();
        obj.where();
//        obj.what();
    }
}
