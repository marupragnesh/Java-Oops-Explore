package abstrpackage;

abstract class car{
   abstract void drive();
   abstract void fly();
   

    void music(){
        System.out.println("play music");
    }
}

abstract class bmw extends car{
    
    // here i only  one method overide but i must be wanted two method overide , so if in this case 
    // if i define abstract class then my wish method can overide 
   
   /*  void drive(){

    }*/
    

    
    // above method is vertually here if i not write then not a problem because abstract class
    
    
    void fly(){
        System.out.println("this car is flying ...");

    }
    
}
class oddi extends bmw{

    void drive(){
        System.out.println("driving .... ");
    }

    
}

public class abstr {
    public static void main(String[] args) {
    car c = new oddi();
    c.drive();
    c.music();
    c.fly();        
    }
}
