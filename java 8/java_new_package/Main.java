package java_new_package;

public class Main {

    static void demo(){
        try{
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e){
            System.out.println("caught inside the method demo");
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            demo();

        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}