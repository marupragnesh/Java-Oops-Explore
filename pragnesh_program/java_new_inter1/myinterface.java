package java_new_inter1;

interface i1{
    void abc();
    void show();
    void notshow();

}

class d implements i1{

    @Override
    public void abc() {
        System.out.println("calling abc");
    }

    public void show(){
        System.out.println("this is show");

    }
   public void notshow(){
        System.out.println("not java_new_inter.a show ");
    }
}

    public class myinterface{
        public static void main(String[] args) {
            i1 obj;
            obj = new d();
            obj.show();
            obj.notshow();

        }
    }