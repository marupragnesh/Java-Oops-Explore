package threading_pack;

class thread1 extends Thread {
    
    public void run() {
        int i =0 ;
        while(i<500){
            System.out.println("cooking cooking cooking");
        }
    }
}

     class thread2 extends Thread
    {
        public void run()
        {
            int i = 0;
            while(i<500)
            {
                System.out.println("watching watching watching");
            }
        }
    }

    public class name {
    public static void main(String[] args) {
        thread1 t1 = new thread1();

        thread2 t2 = new thread2();
        t1.start();
        t2.start();

    }
}
