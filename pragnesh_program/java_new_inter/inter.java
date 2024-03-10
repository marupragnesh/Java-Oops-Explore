package java_new_inter;

interface a
{
    void show();



}

class b implements a {
    public void show(){
        System.out.println("hii");
    }

   public void display(){

    }
}


public class inter {
    public static void main(String[] args) {
        b obj = new b();
        obj.show();
//        obj.display();
    }
}
