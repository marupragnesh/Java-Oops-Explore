package java_mycore_module;

public class privatecon {
   static int count = 0;
     public  privatecon(){
        count++;
    }
    public static void main(String[] args) {
        privatecon p1 = new privatecon();
        privatecon p2 = new privatecon();
        System.out.println("there are "+count +"object created");
    }
}
