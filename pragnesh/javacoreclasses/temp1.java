package javacoreclasses;

public class temp1 {
    temp2 i;
    class temp2{
        temp2(){
        System.out.println(i + " is of type " + ((Object)i).getClass().getSimpleName());  }

        temp2 t2 = new temp2(); 
        }
    
public static void main(String[] args) {
    temp1 t1 = new temp1();
    
}
    
}
