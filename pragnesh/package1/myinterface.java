package package1;

interface i1{
    void show();
    void notshow();

}

class b implements i1{

    public void show(){
        System.out.println("this is show");

    }
    public void notshow(){
        System.out.println("not a show ");
    }
}

public class myinterface{
    public static void main(String[] args) {
        i1 obj;
         obj = new b();
        obj.show();
        obj.notshow();
        
    }
}