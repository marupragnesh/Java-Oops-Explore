package demointerface;

interface compu{
    void show1();
    default void name(){
        System.out.println("this is compu");
    }
}



interface lapu{
    void show1();

   default void name(){
    System.out.println("this is lapu");
   }
}

class merge implements compu , lapu{

    @Override
    public void show1() {
        System.out.println("i dont know i1 or i2");        
    }

    @Override
    public void name() {
        System.out.println("this is override");        
    }

    

}

class computer{
    void show(){

    }
    
}

class laptop extends computer{

    void show(){
        System.out.println("This is laptop");
    }

}
class desktop extends computer{
    void show(){
        System.out.println("This is desktop");
    }

}

class dev{
    void show(computer lap){
        lap.show();
        System.out.println("This is devloper");

    }

}


public class Demointerface {
    public static void main(String[] args) {
        
        computer lap = new laptop();
        computer desk = new desktop();
        dev d = new dev();
        d.show(desk);
        compu m1= new merge();
        m1.show1();
        m1.name();
        
        // object threading_pack.name is powerfull then parameter of class dev -> show method

    }
}
