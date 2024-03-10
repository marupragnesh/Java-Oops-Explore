package callbyref_object;

public class ReturnObject
{
int a,b;
ReturnObject()
{

}
ReturnObject(int a,int b)
{
this.a=a;
this.b=b;
}
ReturnObject swap(ReturnObject temp)
{
int t = temp.a;
temp.a=temp.b;
temp.b=t;
return temp;
}

}
