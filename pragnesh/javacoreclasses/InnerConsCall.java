package javacoreclasses;

public class InnerConsCall {
    public static class ReturnObject
{
int a,b;
ReturnObject()
{
    System.out.println("call without parameterize constructor");
}
ReturnObject(int a,int b)
{
this.a=a;
this.b=b;
}

    public void display()
    {
        System.out.println("calling inner class display method");
    }
}
    
public static void main(String[] args) {
    InnerConsCall c1 = new InnerConsCall();
  InnerConsCall.ReturnObject returnObject = new ReturnObject();
  InnerConsCall.ReturnObject returnObject1 = new ReturnObject(11, 11);


//    returnObject.swap(returnObject temp);
}
}
