package java_my_threading;


public class Threading {
    public static void main(String[] args) {
        System.out.println("this is ");
        Runnable t = () -> {
            for (int i = 1; i < 100; i++) {
                System.out.println("----------");
            }
        };


        Runnable t1 = () -> {
            for (int i = 1; i < 100; i++) {
                System.out.println("+++++++++");
            }
        };


        Thread o1 = new Thread(t);
        Thread o2 = new Thread(t1);
//   Th1 t2 = new Th1();
        o1.start();
        o2.start();

    }


}