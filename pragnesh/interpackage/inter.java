package interpackage;

///   not good program
public class inter {
    void some(){
        System.out.println("this is inter");

    }
}

class laptop extends inter{
   public void lap(inter i9){
        System.out.println("this is laptop");
        i9.some();

    }
}

// adding after two months extedns laptop
 class computer extends laptop{
        void compile(laptop ii, inter i8)
        {
//            laptop ii = new laptop();
//            inter ii = new inter();
//            inter i8;
            ii.lap(i8);
            System.out.println("this is computer");
        }
}
 abstract class inter2 {
    abstract void some();    // void some (){}  error ; because method
     // must be define body or without body define method it must be abstract ,
     // and if abstract method is present then class must be abstract
    // it is solve by interface

     void no(){
        System.out.println("this is no method");
    }

}
class name extends inter2 {

    @Override
    void some(){
        System.out.println("this is threading_pack.name class method");
    }
    void show(){
        System.out.println("this is extra method add.");
    }
}

interface inter1{
    void some();
}

interface delete
{
    public void delete();
}

class deleteclass implements delete
{

    @Override
    public void delete() {
        System.out.println("delete method is call");
    }
}




class call {
    public static void main(String[] args) {
        inter2 i2 = new name();
        i2.some();
        // i2.show(); error
        // after learn spring then after added



        i2.no();
        inter ii = new inter();
        ii.some();

        delete d = new deleteclass();
        d.delete();

//        inter ii = new inter();

//        computer c2 = new laptop();
//        c2.compile(ii);

//        computer cc = new computer();
//        cc.compile();


        
    }
}
