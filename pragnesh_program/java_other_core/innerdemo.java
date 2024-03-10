package java_other_core;

class outer{
    int i;
    inner k;
    public void outermethod()
    {
        System.out.println("hellow");
    }
//    System.out.println("k value is ");
      class inner{

        int j ;
        public void innermethod() {
            System.out.printf("Hiiii");
        }

               void innermethod1()
            {
                System.out.println("this is inner static method");
            }
        }
    }



public class innerdemo {
    public static void main(String[] args) {
        outer o1 = new outer();
        o1.outermethod();



//        java_other_core.outer.inner n2 = new.

//        java_other_core.outer.inner n1 = new.o1();
//        n1.innermethod();
//        java_other_core.outer.inner.innermethod1();
    }
}
