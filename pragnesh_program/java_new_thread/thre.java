package java_new_thread;

class th implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i+" "+Thread.currentThread().getName());
        }

    }


}


public class thre {
    public static void main(String[] args) {


        th t = new th();
        th tt = new th();
        Thread t1 = new Thread(t,"Maru");
        Thread t2 = new Thread(t,"Sachin");




        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t1.start();

        t2.start();

        boolean b =t1.isAlive();
        System.out.println(b);


    }
}