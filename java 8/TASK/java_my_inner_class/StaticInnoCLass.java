package java_my_inner_class;

// in innerstatic class you must be create object as reference but not use new keyword line no.24
class Inner1 {
    int age;

    void show() {
        System.out.println("this is show");
    }

        static void abc(){
            System.out.println("This is abc");
    }

  static   class Inner2 {

        int height;

        void height(){
            System.out.println("This is my height");
        }
       static void weight() {
            System.out.println("this is weight");
        }
    }
}
        public class StaticInnoCLass {

            public static void main(String[] args) {
                Inner1 i1 = new Inner1();
                i1.show();
                Inner1.abc();

                Inner1.Inner2 i2 = new Inner1.Inner2();
                Inner1.Inner2.weight();

//                i2.height();
            }
}
