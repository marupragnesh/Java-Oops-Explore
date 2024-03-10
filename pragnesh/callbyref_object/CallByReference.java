package callbyref_object;

public class CallByReference {
int a,b;
CallByReference(int a,int b)
{
this.a=a;
this.b=b;
}
void swap(CallByReference temp)
{
int t = temp.a;
temp.a=temp.b;
temp.b=t;

}
}