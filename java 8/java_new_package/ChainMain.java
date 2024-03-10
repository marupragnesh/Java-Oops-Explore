package java_new_package;

public class ChainMain {
    public static void main(String[] args) {
        try{
          Chain.calling();
            
        }catch (Exception a){
            System.out.println("caught : "+ a);
            System.out.println("original cause : "+a.getMessage());

            System.out.println(a.getCause());
        }
    }
}
