package java_new_package;

class pragnesh extends Exception{

    void pragnesh(){
        System.out.println("this is made by java_new_package.pragnesh");
    }
}


public class EH1 {

    public static void main(String[] args) {
        int ans;

        int i = 10;
        int j = 0;
        int k[] = new int[5];

        try

        {
             ans = i / j;



//            k[10] = 30;
            System.out.println(k[10]);

        }
        catch (ArithmeticException e)
        {

            System.out.println("this is arithmetic exception");
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
//            System.out.println(a.getMessage());
            System.out.println("this is array error");
            a.printStackTrace();
            System.out.println();
            System.out.println();
            System.out.println();

        }
        catch(Exception e){
            System.out.println("all error");
            e.printStackTrace();
            System.out.println();
        }

    }
}
