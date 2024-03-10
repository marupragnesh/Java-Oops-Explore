package java_new_package;

public class Understanding
{
    // defining a user-defined method
    // which throws ArithmeticException
    static void method() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("Inside the method()");
        throw new ArrayIndexOutOfBoundsException("throwing ArithmeticException");
    }
    //main method
    public static void main(String args[])
    {
        try
        {
            method();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("caught in main() method");
        }
    }
}