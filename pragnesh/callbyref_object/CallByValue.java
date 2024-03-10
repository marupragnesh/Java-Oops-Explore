package callbyref_object;

public class CallByValue {
    int a,b;
    CallByValue(int a,int b)
    {
    this.a=a;
    this.b=b;
    }
    void swap()
    {
    int t = a;
    a=b;
    b=t;
    }
    
    }