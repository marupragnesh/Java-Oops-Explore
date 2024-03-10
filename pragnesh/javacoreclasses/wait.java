package javacoreclasses;

class c1{
    void c(){
        System.out.println("C");}

        void d(){
            System.out.println("D");
        }
    
}

class c2 extends c1{
    void c(c1 cc2){
        System.out.println("hehehe");
        cc2.c();}
    void z(){
        System.out.println("z");}
        void x(){
            System.out.println("x");

    }
}
public class wait {
    public static void main(String[] args) {
        c1 op = new c1();
        c2 cc = new c2();
        // javacoreclasses.c2 ccc = new javacoreclasses.c2();
        cc.c(op);
        cc.c();
        cc.d();
       System.out.println("javacoreclasses.wait");
       


        
    }
}
